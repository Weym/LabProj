package tela;


import java.util.Scanner;


public class Main {
	

	public static void main(String[] args) {
		
			Scanner sc = new Scanner (System.in);

		do{		
			
			System.out.println("Selecione o m�dulo: ");
			System.out.println("[1] Livro" + 
								"\n[2] Usu�rio" + 
								"\n[3] Autor"	+ 
								"\n[4] Empr�stimo de livros" + 
								"\n[5] Buscar" + 
								"\n[6] Listar");
			String opcao = sc.next();
			
			if (opcao.equalsIgnoreCase("1")){
				OpcoesLivro.apresentacao();
			}
			
			else if (opcao.equalsIgnoreCase("2")){
				OpcoesCliente.apresentacao();
				System.out.println("M�dulo do Usu�rio:");
			}
			
			else if (opcao.equalsIgnoreCase("sair")){
				break;
			}
			
			
			while(true);
		}
		while(true);
	}

}