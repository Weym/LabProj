package tela;

import negocio.Utils;

import java.util.ArrayList;
import java.util.Scanner;

import dados.DadosCliente;
import entidades.Cliente;

public class OpcoesCliente {

	
	public static void apresentacao(){
		String opcao;
		String nome;
		char sexo;
		int idade;
		String telefone;
		String cpf;
		boolean condicao = true;

		
		Scanner sc = new Scanner (System.in);
		
		ArrayList<Cliente> lista = new ArrayList<Cliente>();
		
		do {
			System.out.println("Opções do módulo Cliente:");
			System.out.println("[1] Cadastrar novo Cliente");
			System.out.println("[2] Modificar Cliente existente");
			System.out.println("[3] Buscar Cliente");
			System.out.println("[4] Remover");
			System.out.println("[5] Listar Clientes (posição temporária)");
			opcao = sc.next();


			if (opcao.equalsIgnoreCase("1")){
				System.out.println("Entre com os dados do cliente ");
				System.out.println("Nome ");
				sc.nextLine();
				nome = sc.nextLine();
				
				System.out.println("Sexo ");
				sexo = sc.next().charAt(0);
				sexo = Character.toUpperCase(sexo);
				
				System.out.println("Idade ");
				idade = sc.nextInt();
				//same
				do{
				System.out.println("Número de telefone");
				telefone = sc.next();
				if (Utils.validarTelefone(telefone)){
					telefone = Utils.formatarTelefone(telefone);
					condicao = false;
					}
				} while(condicao);
				do{
					System.out.println("CPF");
					cpf = sc.next();
					if (Utils.validarCpf(cpf)){

						cpf = Utils.formatarCPF(cpf);
						condicao = false;
					}
				} while(condicao);
				
				//validar nome, pensar em pedir sobre nome separado ou colocar junto tbm
				
				Cliente cliente = new Cliente(nome, sexo, idade, telefone, cpf);
				DadosCliente.salvar(cliente, nome + ".txt");
			}
			
			else if (opcao.equalsIgnoreCase("2")){
				System.out.println("Digite o nome do cliente que deseja modificar: ");
				sc.nextLine();
				String busca = sc.nextLine();
				
				DadosCliente.modificar(busca + ".txt");
				
			}
			
			else if (opcao.equalsIgnoreCase("3")){
				System.out.println("Digite o nome do cliente que deseja buscar");
				String clienteBuscar = sc.nextLine();
				clienteBuscar = sc.nextLine();
				clienteBuscar+=".txt";
				System.out.println(DadosCliente.buscar(clienteBuscar));
				System.out.println();
			}
			
			else if (opcao.equalsIgnoreCase("4")){
				System.out.println("Digite o nome do cliente que deseja remover");
				sc.nextLine();
				nome = sc.nextLine();
				nome+=".txt";
				DadosCliente.remover(nome);
				
			}
			
			else if (opcao.equalsIgnoreCase("5")){
				System.out.println("Lista de todos os clientes cadastrados: ");
				DadosCliente.listarClientes();
			
			}

			
			else if (opcao.equalsIgnoreCase("sair")){
				break;
			}
			else{
				System.out.println("ERRO. Escolha uma opção de 1 a 5. Case deseje sair, escreva \"Sair\".");
			}
		}
		while(true);
	}
	

}
