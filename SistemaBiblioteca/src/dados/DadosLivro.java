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
   	 	String dir = "C:/Users/Weydson/Desktop/workplace/SistemaBiblioteca/Livros/"+caminho;
 
       
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
		String titulo;
		int numeroPaginas;
		int exemplares;
		Autor autor;
		
		
		titulo = livro.getTitulo();
		numeroPaginas = livro.getNumeroPaginas();
		exemplares = livro.getExemplares();
		autor = livro.getAutor();
		
		String novoTitulo;
		int novoNumeroPaginas, novoExemplares;
		Autor novoAutor;
		
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
			livro.getTitulo();
			titulo = sc.nextLine();
		}
		

		else if (opcao.equalsIgnoreCase("2")){
			System.out.println("[2] úmero de Páginas ");
			numeroPaginas = sc.nextInt();
			//validar só números, evitar dar excessão
		}

		else if (opcao.equalsIgnoreCase("3")){
			System.out.println("[3] Quantidade de exemplares");
			exemplares = sc.nextInt();
			//same
		}

		else if (opcao.equalsIgnoreCase("4")){
			System.out.println("[4] Autor do livro");
			String autorNome = sc.next();
			autor = new Autor(autorNome);
		}
		
		else {
			System.out.println("Opções válidas de [1] a [4], se quiser voltar digite \"Sair\"");
		}

		
		System.out.println("Digite as novas informações do livro ");
		
		livro = new Livro(titulo, numeroPaginas, exemplares, autor);
		System.out.println("Os dados do livro ficaram: ");
		System.out.println("Título: " + titulo + "\nNúmero de páginas: " +numeroPaginas + "\nExemplares: " + exemplares + "Autor: " +autor);

		remover(caminho);
		salvar(livro, titulo + ".txt");
		}
		while (true);
	}
    
    public static void salvar(Object objeto, String caminho) {
   	 	String dir = "C:/Users/Weydson/Desktop/workplace/SistemaBiblioteca/Livros/"+caminho;
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
	
	public static void listarArquivos() {
		
		    String dir = "C:/Users/Weydson/Desktop/workplace/SistemaBiblioteca/Livros/";
			File file = new File(dir);
			File afile[] = file.listFiles();
			int i = 0;
			System.out.println("Número de livros no catalogo: " + afile.length ); 
			for (int j = afile.length; i < j; i++) {
				File arquivos = afile[i];
				System.out.println(buscar(arquivos.getName()));
				}
			}
	
	public static void remover(String livro){
		
		
	    String arquivo = "C:/Users/Weydson/Desktop/workplace/SistemaBiblioteca/Livros/" + livro;
	    
    		System.out.println(arquivo);
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