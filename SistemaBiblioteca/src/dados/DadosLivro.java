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
		String titulo;
		
		buscar(caminho);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite as novas informações do livro ");
		System.out.println("Título ");
		titulo = sc.nextLine();
		
		System.out.println("Número de Páginas ");
		int numeroPaginas = sc.nextInt();
		//validar só números, evitar dar excessão
		
		System.out.println("Quantidade de exemplares");
		int exemplares = sc.nextInt();
		//same
		
		System.out.println("Autor do livro");
		String autorNome = sc.next();
		Autor autor = new Autor(autorNome);
		
		Livro livro = new Livro(titulo, numeroPaginas, exemplares, autor);

		remover(caminho);
		salvar(livro, titulo + ".txt");

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