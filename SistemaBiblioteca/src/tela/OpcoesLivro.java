package tela;

import entidades.Autor;
import entidades.Livro;
import java.util.Scanner;
public class OpcoesLivro {

	public void cadastrar(){
		Scanner sc = new Scanner (System.in);
		
		String titulo;
		String opcao;
		int numeroPaginas;
		int exemplares;
		String autorNome;
		
		
		do {
		
			System.out.println("Op��es do m�dulo Livro:");
			System.out.println("1. Cadastrar novo livro");
			System.out.println("2. Modificar livro existente");
			System.out.println("3. Buscar livro");
			System.out.println("4. Excluir");
			opcao = sc.next();
			
			
			if (opcao.equalsIgnoreCase("1")){
				System.out.println("Entre com os dados do livro ");
				System.out.println("T�tulo ");
				titulo = sc.next();
				System.out.println("N�mero de P�ginas ");
				numeroPaginas = sc.nextInt();
				System.out.println("Quantidade de exemplares");
				exemplares = sc.nextInt();
				System.out.println("Autor do livro");
				autorNome = sc.next();
				
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
				System.out.println("Op��o ainda n�o implementada.");
				break;
			}
			
			else if (opcao.equalsIgnoreCase("4")){
				System.out.println("Op��o ainda n�o implementada.");
				break;
			}
		}
		}
		while(true);
	}
	
	public void listar(){
		
	}
	
	public void modificar(){
		
	}
	
	public void deletar(){
		
	}
	
}
