package tela;

import entidades.Autor;
import entidades.Livro;
import dados.DadosLivro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import repositorio.RepositorioLivro;
public class OpcoesLivro {

	static RepositorioLivro rp = new RepositorioLivro();
	
	//Colocar ID nos livros/usuários? se bem que livro pode usar o ISBN.
	
	public static void cadastrar(){
		String titulo;
		String opcao;
		int numeroPaginas;
		int exemplares;
		String autorNome;
		
		
		Scanner sc = new Scanner (System.in);
		
		//lembrar de fechar o Scanner -> sc.close();
		

		
		ArrayList<Livro> lista = new ArrayList<Livro>();
		
		do {
			System.out.println("Opções do módulo Livro:");
			System.out.println("1. Cadastrar novo livro");
			System.out.println("2. Modificar livro existente");
			System.out.println("3. Buscar livro");
			System.out.println("4. Remover");
			System.out.println("5. Listar livros (posição temporária)");
			opcao = sc.next();


			if (opcao.equalsIgnoreCase("1")){
				System.out.println("Entre com os dados do livro ");
				System.out.println("Título ");
				titulo = sc.next();
				//permitir salvar com mais de um nome, dando espaço e blabla.. validar o nome
				//validar cadastro duplicado (mais avançado: em caso de duplicada
				//perguntar se quer adicionar a quantidade que tentou cadastrar ou cancelar o cadastro
				
				System.out.println("Número de Páginas ");
				numeroPaginas = sc.nextInt();
				//validar só números, evitar dar excessão
				
				System.out.println("Quantidade de exemplares");
				exemplares = sc.nextInt();
				//same
				
				System.out.println("Autor do livro");
				autorNome = sc.next();
				//validar nome, pensar em pedir sobre nome separado ou colocar junto tbm
				
				Autor autor = new Autor(autorNome);
				Livro livro = new Livro(titulo,  numeroPaginas, exemplares, autor);
				rp.salvarLivro(livro);
				DadosLivro.salvar(livro, titulo + ".txt");
			}
			
			else if (opcao.equalsIgnoreCase("2")){
				System.out.println("Digite o nome que deseja alterar: ");
				String busca = sc.next();
				for (int i = 0; i < lista.size(); i++){
					if (busca.equalsIgnoreCase(lista.get(i).getTitulo())){
						System.out.println(lista.get(i).getTitulo());
					}	
					else {
						System.out.println("ERRO. Não existe livro com este nome.");
					}
				}
			}
			
			else if (opcao.equalsIgnoreCase("3")){
				System.out.println("Digite o nome do livro que deseja buscar");
				String livroBuscar = sc.next();
				livroBuscar+=".txt";
				System.out.println(DadosLivro.restaurar(livroBuscar));
				System.out.println();
			}
			
			else if (opcao.equalsIgnoreCase("4")){
				System.out.println("Digite o nome do livro que deseja remover");
				String livroRemover = sc.next();
				livroRemover+=".txt";
				DadosLivro.remover(livroRemover);
			}
			
			else if (opcao.equalsIgnoreCase("5")){
				System.out.println("Lista de todos os livros em catálogo: ");
				DadosLivro.listarArquivos();
			
			}

			
			else if (opcao.equalsIgnoreCase("sair")){
				return;
			}
			else{
				System.out.println("ERRO. Escolha uma opção de 1 a 5. Case deseje sair, escreva \"Sair\".");
			}
		}

		while(true);
	}
}
