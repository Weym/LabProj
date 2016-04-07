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
	List<Livro> lista = new ArrayList<Livro>();

	public static void main(String[] args) {
		
			Scanner sc = new Scanner (System.in);

		
			
			
			ArrayList<Livro> lista = new ArrayList<Livro>();
			Autor autor = new Autor ("George R R Martin", null);
			Livro livro1 = new Livro("Game of Thrones",  573, 3, new Autor("George R R Martin"));
			Livro livro2 = new Livro("Java for Dummy",  1024, 8, new Autor("Autor1"));
			Livro livro3 = new Livro("Java: Como programar",  2015, 37, new Autor("Autor2"));
			Livro livro4 = new Livro("Use a cabeça: Java!",  2048, 3, new Autor("Autor3"));
			rp.salvaLivro(livro1);
			rp.salvaLivro(livro2);
			rp.salvaLivro(livro3);
			rp.salvaLivro(livro4);

			lista.add(livro1);
			lista.add(livro2);
			lista.add(livro3);
			lista.add(livro4);

			
			Utils.salvar(lista, "Livro.sav");
			
			System.out.println(Utils.restaurar("Livro.sav"));

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
			
			
			
		System.out.println("");
		System.out.println();
		System.out.println();
		/*
		
		do{		
			
			System.out.println("Selecione o módulo: ");
			System.out.println("1. Livro" + 
		"\n2. Usuário" + "\n3. Autor"
				+ "\n4. Empréstimo de livros" + "\n5. Buscar" + "\n6. Listar");
			String opcao = sc.next();
			
			if (opcao.equalsIgnoreCase("1")){
				System.out.println("Opções do módulo Livro:");
				System.out.println("1. Cadastrar novo livro");
				System.out.println("2. Modificar livro existente");
				System.out.println("3. Buscar livro");
				System.out.println("4. Excluir");
				opcao = sc.next();
				
				
				if (opcao.equalsIgnoreCase("1")){
					System.out.println("Entre com os dados do livro ");
					System.out.println("Título ");
					String titulo = sc.next();
					System.out.println("Número de Páginas ");
					int numeroPaginas = sc.nextInt();
					System.out.println("Quantidade de exemplares");
					int exemplares;
					System.out.println("Autor do livro");
					String autorNome = sc.next();
					
					new Livro("Game of Thrones",  573, 3, new Autor("George R R Martin"));
					
				}
				
				else if (opcao.equalsIgnoreCase("2")){
					System.out.println("Digite o nome que deseja alterar: ");
					String busca = sc.next();
					for (int i = 0; i < lista.size(); i++){
						if (busca.equalsIgnoreCase(lista.get(i).getTitulo())){
							System.out.println(lista.get(i).getTitulo());
						}	
					}
				}
				
				else if (opcao.equalsIgnoreCase("3")){
					System.out.println("Opção ainda não implementada.");
					break;
				}
				
				else if (opcao.equalsIgnoreCase("4")){
					System.out.println("Opção ainda não implementada.");
					break;
				}
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
*/
	}
	public List<Livro> listar() {
		// TODO Auto-generated method stub
		return this.lista;
}

}