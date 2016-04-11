package dados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import entidades.Cliente;

public class DadosCliente {
	
	public static Object buscar(String caminho) {
	   	 
        Object objeto = null;
   	 	String dir = "Clientes\\"+caminho;
       
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
		
		
		buscar(caminho);
		
		Cliente cliente = new Cliente();
		cliente = (Cliente) buscar(caminho);

		String nome = cliente.getNome();
		char sexo = cliente.getSexo();
		int idade = cliente.getIdade();
		String telefone = cliente.getTelefone();
		String cpf = cliente.getCpf();
		
		String novoNome = nome;
		char novoSexo = sexo;
		int novaIdade = idade;
		String novoTelefone = telefone;
		String novoCpf = cpf;
		
		boolean operacao = true;
		
		buscar(caminho);
		Scanner sc = new Scanner(System.in);
		
		do {
			String opcao;
			System.out.println();
		System.out.println("Qual informação deseja modificar?");
		System.out.println("[1] Nome");
		System.out.println("[2] Sexo");
		System.out.println("[3] Idade");
		System.out.println("[4] Telefone");
		System.out.println("[5] Cpf");
		opcao = sc.next();
		
		if (opcao.equalsIgnoreCase("Sair")){
			return;
		}
			
		if (opcao.equalsIgnoreCase("1")){
			System.out.println("[1] Nome ");
			novoNome = sc.next();
			
			System.out.println("Você mudou o título do cliente de [" + nome + "] para [" + novoNome + "].\n");
		}
		

		else if (opcao.equalsIgnoreCase("2")){
			System.out.println("[2] Sexo ");
			novoSexo = sc.next().charAt(0);
			//validar só números, evitar dar excessão
		}

		else if (opcao.equalsIgnoreCase("3")){
			System.out.println("[3] Idade");
			novaIdade = sc.nextInt();
			//same
		}

		else if (opcao.equalsIgnoreCase("4")){
			System.out.println("[4] Telefone");
			novoTelefone = sc.next();
		}
		
		else if (opcao.equalsIgnoreCase("5")){
			System.out.println("[4] CPF");
			novoCpf = sc.next();
		}
		
		else {
			System.out.println("Opções válidas de [1] a [5], se quiser voltar digite \"Sair\"");
		}
		
		cliente = new Cliente(novoNome, novoSexo, novaIdade, novoTelefone, novoCpf);
		System.out.println("Os dados do cliente ficaram: ");
		System.out.println("\nNome: " + nome + "\nSexo: " + sexo + "\nIdade: " + idade + "\nTelefone: " + telefone + "\nCPF: " + cpf);

		remover(caminho);
		salvar(cliente, nome + ".txt");
		}
		while (operacao);
	}
    
    public static void salvar(Object objeto, String caminho) {
   	 	String dir = "Clientes\\"+caminho;
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
	
	public static void listarClientes() {
		
		    String dir = "Clientes\\";
			File file = new File(dir);
			File afile[] = file.listFiles();
			int i = 0;
			for (int j = afile.length; i < j; i++) {
				File arquivos = afile[i];
				System.out.println(buscar(arquivos.getName()));
				}
			}
	
	public static void remover(String cliente){
		
		
	    String arquivo = "Clientes\\" + cliente;
	    
		    File file = new File(arquivo);
    		if(file.delete()){
    			String MsgSaida;
    			MsgSaida = file.getName();
    			MsgSaida = MsgSaida.replaceAll(".txt", "");
    			System.out.println("Operação realizada com sucesso no cliente " + MsgSaida + ".");
    		}else{
    			String MsgSaida = file.getName();
    			System.out.println(MsgSaida);
    			System.out.println("Este cliente não existe!");
    		}
    	   
    	}
	

	
}