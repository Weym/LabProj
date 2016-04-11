package tela;

import entidades.Autor;
import entidades.Livro;
import dados.DadosLivro;
import java.util.Scanner;

public class OpcoesLivro {

	
	//Colocar ID nos livros/usuários? se bem que livro pode usar o ISBN.
	
	public static void apresentacao(){
		String titulo;
		String opcao;
		int numeroPaginas;
		int exemplares;
		String autorNome;
		
		Scanner sc = new Scanner (System.in);
		
		//lembrar de fechar o Scanner -> sc.close();
		

		
		do{
			System.out.println("Opções do módulo Livro:");
			System.out.println("[1] Cadastrar novo livro");
			System.out.println("[2] Modificar livro existente");
			System.out.println("[3] Buscar livro");
			System.out.println("[4] Remover");
			System.out.println("[5] Listar livros (posição temporária)");
			opcao = sc.next();


			if (opcao.equalsIgnoreCase("1")){
				System.out.println("Entre com os dados do livro ");
				System.out.println("Título ");
				sc.nextLine();
				titulo = sc.nextLine();
				//validar cadastro duplicado (mais avançado: em caso de duplicada
				//perguntar se quer adicionar a quantidade (?) que tentou cadastrar ou cancelar o cadastro
				
				System.out.println("Número de Páginas ");
				numeroPaginas = sc.nextInt();
				//validar só números, evitar dar excessão
				
				System.out.println("Quantidade de exemplares");
				exemplares = sc.nextInt();
				//same
				
				System.out.println("Autor do livro");
				sc.nextLine();
				autorNome = sc.nextLine();
				//validar nome, pensar em pedir sobre nome separado ou colocar junto tbm
				
				Autor autor = new Autor(autorNome);
				Livro livro = new Livro(titulo, numeroPaginas, exemplares, autor);
				DadosLivro.salvar(livro, titulo + ".txt");
			}
			
			else if (opcao.equalsIgnoreCase("2")){
				System.out.println("Digite o nome do livro que deseja modificar: ");
				sc.nextLine();
				String busca = sc.nextLine();
				DadosLivro.modificar(busca + ".txt");
			}
			
			else if (opcao.equalsIgnoreCase("3")){
				System.out.println("Digite o nome do livro que deseja buscar");
				String livroBuscar = sc.nextLine();
				livroBuscar = sc.nextLine();
				livroBuscar+=".txt";
				System.out.println(DadosLivro.buscar(livroBuscar));
				System.out.println();
			}
			
			else if (opcao.equalsIgnoreCase("4")){
				System.out.println("Digite o nome do livro que deseja remover");
				sc.nextLine();
				String livroRemover = sc.nextLine();
				livroRemover+=".txt";
				DadosLivro.remover(livroRemover);
			}
			
			else if (opcao.equalsIgnoreCase("5")){
				System.out.println("Lista de todos os livros em catálogo: ");
				DadosLivro.listarLivros();
			}
			
			else if (opcao.equalsIgnoreCase("sair")){
				break;
			}
			else{
				System.out.println("ERRO. Escolha uma opção de 1 a 5. Case deseje sair, escreva \"Sair\".");
			}
	}while(true);
		
	}
}
