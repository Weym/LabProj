package tela;


import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {

			Scanner sc = new Scanner (System.in);

		do{		
			
			System.out.println("Selecione o módulo: ");
			System.out.println("[1] Livro" + 
								"\n[2] Cliente" + 
								"\n[3] Autor"	+ 
								"\n[4] Empréstimo de livros" + 
								"\n[5] Buscar" + 
								"\n[6] Listar");
			String opcao = sc.next();
			
			if (opcao.equalsIgnoreCase("1")){
				System.out.println();
				OpcoesLivro.apresentacao();
			}
			
			else if (opcao.equalsIgnoreCase("2")){
				System.out.println();
				OpcoesCliente.apresentacao();
			}
			
			else if (opcao.equalsIgnoreCase("sair")){
				break;
			}
			
			
			while(true);
		}
		while(true);
	}

}