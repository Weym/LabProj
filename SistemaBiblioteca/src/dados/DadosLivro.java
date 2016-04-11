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
		System.out.println("Qual informação deseja modificar?");
		System.out.println("[1] Título");
		System.out.println("[2] Número de Páginas");
		System.out.println("[3] Quantidade de exemplares");
		System.out.println("[4] Autor");
		opcao = sc.next();
		
		if (opcao.equalsIgnoreCase("Sair")){
			return;
		}
			
		if (opcao.equalsIgnoreCase("1")){
			System.out.println("[1] Título ");
			novoTitulo = sc.next();
			
			System.out.println("Você mudou o título do livro de [" + titulo + "] para [" + novoTitulo + "].\n");
		}
		

		else if (opcao.equalsIgnoreCase("2")){
			System.out.println("[2] úmero de Páginas ");
			novoNumeroPaginas = sc.nextInt();
			//validar só números, evitar dar excessão
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
			System.out.println("Opções válidas de [1] a [4], se quiser voltar digite \"Sair\"");
		}
		
		livro = new Livro(novoTitulo, novoNumeroPaginas, novoExemplares, novoAutor);
		System.out.println("Os dados do livro ficaram: ");
		System.out.println("Título: " + titulo + "\nNúmero de páginas: " + numeroPaginas + "\nExemplares: " + exemplares + "\nAutor: " + autor);

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
			System.out.println("Número de livros no catalogo: " + afile.length ); 
			System.out.println("\n|  Título, número de páginas, Exemplares, Autor  |\n");
			for (int j = afile.length; i < j; i++) {
				File arquivos = afile[i];
				System.out.println("º " + buscar(arquivos.getName()) + "\n");
				}
			}
	
	public static void remover(String livro){
		
		
	    String arquivo = "C:/Users/Weydson/Desktop/workplace/SistemaBiblioteca/Livros/" + livro;
	    
		    File file = new File(arquivo);
    		if(file.delete()){
    			String MsgSaida;
    			MsgSaida = file.getName();
    			MsgSaida = MsgSaida.replaceAll(".txt", "");
    			System.out.println("Operação realizada com sucesso no livro " + MsgSaida + ".");
    		}else{
    			System.out.println("Este livro não existe!");
    		}
    	   
    	}
	
}