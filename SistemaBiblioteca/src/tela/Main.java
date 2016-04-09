package tela;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import repositorio.RepositorioLivro;
import negocio.Utils;
import entidades.Autor;
import entidades.Livro;

public class Main {
	
	private static RepositorioLivro rp = new RepositorioLivro();
	List<Livro> lista1 = new ArrayList<Livro>();

	public static void main(String[] args) {
		
			Scanner sc = new Scanner (System.in);
 
/*
			System.out.println( Utils.restaurar("LivroTeste.txt"));
			List<Livro> lista = new ArrayList<Livro>();

			lista = rp.listarLivros();
			System.out.println(lista);
			System.out.println(Utils.restaurar("LivroTeste.txt"));
			
			System.out.println("-----------------------------------------");
			
			for (Livro livro: lista) {

				System.out.println("Título : " + livro.getTitulo());
				System.out.println("Número de páginas : " + livro.getNumeroPaginas());
				System.out.println("Exemplares : " + livro.getExemplares());
				System.out.println("Nome do Autor : " + livro.getAutor());
				System.out.println("-----------------------------------------");
			}
			
				System.out.println("\n\n");
				System.out.println("-----------------------------------------");
			for (Livro livro: lista) {
				System.out.println(livro.getAutor() + ", " + livro.getTitulo() + ", " + livro.getNumeroPaginas() + ", " +  livro.getExemplares());
				System.out.println("-----------------------------------------");

			}
			*/
		do{		
			
			System.out.println("Selecione o módulo: ");
			System.out.println("[1] Livro" + 
		"\n[2] Usuário" + "\n[3] Autor"
				+ "\n[4] Empréstimo de livros" + "\n[5] Buscar" + "\n[6] Listar");
			String opcao = sc.next();
			
			if (opcao.equalsIgnoreCase("1")){
				
				OpcoesLivro.cadastrar();

				

			}
			
			
			else if (opcao.equalsIgnoreCase("2")){
				System.out.println("Módulo do Usuário:");
			}
			
			else if (opcao.equalsIgnoreCase("sair")){
				break;
			}
			
			
			while(true);
		}
		while(true);

	}
	public List<Livro> listar() {
		// TODO Auto-generated method stub
		return this.lista1;
}

}