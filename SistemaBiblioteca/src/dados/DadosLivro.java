package dados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import entidades.Autor;
import entidades.Livro;

public class DadosLivro {
	
	public static Object buscar(String caminho) {
	   	 
        Object objeto = null;
   	 	String dir = "Livros\\"+caminho;
       
        try {
               FileInputStream restFile = new FileInputStream(dir);
               ObjectInputStream stream = new ObjectInputStream(restFile);

               // recupera o objeto
               objeto = stream.readObject();
               stream.close();
        } catch (Exception e) {
               e.printStackTrace();
        }

        return objeto;
 }
	
	public static void modificar(String caminho){
		
		
		buscar(caminho);
		
		Livro livro = new Livro();
		livro = (Livro) buscar(caminho);

		String titulo = livro.getTitulo();
		int numeroPaginas = livro.getNumeroPaginas();
		int exemplares = livro.getExemplares();
		Autor autor = livro.getAutor();
		
		String novoTitulo = titulo;
		int novoNumeroPaginas = numeroPaginas;
		int novoExemplares = exemplares;
		Autor novoAutor = autor;
		
		boolean operacao = true;
		
		buscar(caminho);
		Scanner sc = new Scanner(System.in);
		
		do {
			String opcao;
			System.out.println();
		System.out.println("Qual informa��o deseja modificar?");
		System.out.println("[1] T�tulo");
		System.out.println("[2] N�mero de P�ginas");
		System.out.println("[3] Quantidade de exemplares");
		System.out.println("[4] Autor");
		opcao = sc.next();
		
		if (opcao.equalsIgnoreCase("Sair")){
			return;
		}
			
		if (opcao.equalsIgnoreCase("1")){
			System.out.println("[1] T�tulo ");
			novoTitulo = sc.next();
			
			System.out.println("Voc� mudou o t�tulo do livro de [" + titulo + "] para [" + novoTitulo + "].\n");
		}
		

		else if (opcao.equalsIgnoreCase("2")){
			System.out.println("[2] �mero de P�ginas ");
			novoNumeroPaginas = sc.nextInt();
			//validar s� n�meros, evitar dar excess�o
		}

		else if (opcao.equalsIgnoreCase("3")){
			System.out.println("[3] Quantidade de exemplares");
			novoExemplares = sc.nextInt();
			//same
		}

		else if (opcao.equalsIgnoreCase("4")){
			System.out.println("[4] Autor do livro");
			String autorNome = sc.next();
			novoAutor = new Autor(autorNome);
		}
		
		else {
			System.out.println("Op��es v�lidas de [1] a [4], se quiser voltar digite \"Sair\"");
		}
		
		livro = new Livro(novoTitulo, novoNumeroPaginas, novoExemplares, novoAutor);
		System.out.println("Os dados do livro ficaram: ");
		System.out.println("T�tulo: " + titulo + "\nN�mero de p�ginas: " + numeroPaginas + "\nExemplares: " + exemplares + "\nAutor: " + autor);

		remover(caminho);
		salvar(livro, titulo + ".txt");
		}
		while (operacao);
	}
    
    public static void salvar(Object objeto, String caminho) {
   	 	String dir = "Livros\\"+caminho;
    	//arquivo
        try {

          FileOutputStream saveFile = new FileOutputStream(dir);
          ObjectOutputStream stream = new ObjectOutputStream(saveFile);

           // salva o objeto
          stream.writeObject(objeto);

          stream.close();
        } catch (Exception exc) {
          exc.printStackTrace();
        }
    				
 }
	
	public static void listarLivros() {
		
		    String dir = "Livros\\";
			File file = new File(dir);
			File afile[] = file.listFiles();
			int i = 0;
			System.out.println("N�mero de livros no catalogo: " + afile.length ); 
			System.out.println("\n|  T�tulo, n�mero de p�ginas, Exemplares, Autor  |\n");
			for (int j = afile.length; i < j; i++) {
				File arquivos = afile[i];
				System.out.println("� " + buscar(arquivos.getName()) + "\n");
				}
			}
	
	public static void remover(String livro){
		
		
	    String arquivo = "C:/Users/Weydson/Desktop/workplace/SistemaBiblioteca/Livros/" + livro;
	    
		    File file = new File(arquivo);
    		if(file.delete()){
    			String MsgSaida;
    			MsgSaida = file.getName();
    			MsgSaida = MsgSaida.replaceAll(".txt", "");
    			System.out.println("Opera��o realizada com sucesso no livro " + MsgSaida + ".");
    		}else{
    			System.out.println("Este livro n�o existe!");
    		}
    	   
    	}
	
}