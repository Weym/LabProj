package dados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

import entidades.Livro;

public class DadosLivro {
	//static String PASTA = "Livros/";
	//static String EXTENSAO = ".txt";

	
	public static Object restaurar(String caminho) {
	   	 
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
		String dir = "C:/Users/Weydson/Desktop/workplace/SistemaBiblioteca/Livros/"+caminho;
		System.out.println("Livro selecionado: " + restaurar(dir));
		
		

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
				System.out.println(restaurar(arquivos.getName()));
				}
			}
	
	public static void remover(String livro){
		
		
	    String arquivo = "C:/Users/Weydson/Desktop/workplace/SistemaBiblioteca/Livros/" + livro;
	    
		
	
    		System.out.println(arquivo);
		    File file = new File(arquivo);
    		if(file.delete()){
    			System.out.println(file.getName() + " foi removido!");
    		}else{
    			System.out.println("A operação de remover falhou!");
    		}
    	   
    	}
	}
	

