package tela;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import dados.DadosLivro;

public class Teste {
	
	public static void main(String[] args) throws IOException {
		
		String livro = "2" + ".txt";
		System.out.println(DadosLivro.restaurar(livro));
		
		}
}