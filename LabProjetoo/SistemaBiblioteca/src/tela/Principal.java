package tela;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

import entidades.Autor;
import entidades.Cliente;
import entidades.Funcionario;
import entidades.Livro;

public class Principal {
	public static void main(String[] args) throws IOException {

		salvarFuncionarios();
		lerFuncionariosSalvos();
		
	}

	public static void login() {
		Scanner scanner = new Scanner(System.in);
		int clienteFuncionario = 0;

		do {
			System.out.println("Digite 1 se você for cliente. ");
			System.out.println("Digite 2 se você for funcionário.");
			System.out.println("Digite 3 para sair");
			clienteFuncionario = scanner.nextInt();

			if (clienteFuncionario == 1) {
				System.out.println("Digite seu nome e sua senha para fazer login como cliente.");
				System.out.println("Caso ainda não tenha conta, se registre primeiro.");
				pedirLoginCliente();

			} else if (clienteFuncionario == 2) {
				System.out.println("Digite seu nome e senha para fazer login como funcionário");
				pedirLoginFuncionario();
			} else if (clienteFuncionario == 5) {
				System.out.println("Você saiu com sucesso.");
			} else {
				System.out.println("Opção inválida. Tente novamente.");
			}
		} while (clienteFuncionario == 1 || clienteFuncionario == 2 || clienteFuncionario == 3
				|| clienteFuncionario == 4);

	}

	public static void salvarFuncionarios() {

		Funcionario funcionario1 = new Funcionario("Anderson Gonçalves", 21, "12365498710", "Senha1");
		Funcionario funcionario2 = new Funcionario("Weydson Marinho", 23, "15476982341", "Senha2");
		Funcionario funcionario3 = new Funcionario("Rosemberg Roberto", 3, "98647531250", "Senha3");
		Funcionario funcionario4 = new Funcionario("Marina Adolfina", 27, "64789231475", "Senha4");
		Funcionario funcionario5 = new Funcionario("Marcela Oliveira", 21, "65437281904", "Senha5");

		try {
			FileOutputStream out = new FileOutputStream("Funcionarios");
			ObjectOutputStream objOut = new ObjectOutputStream(out);

			objOut.writeObject("Nome:" + funcionario1.getNome() + " idade: " + funcionario1.getIdade() + " CPF: "
					+ funcionario1.getCpf() + " Senha: " + funcionario1.getSenha() + "\r\n");
			objOut.writeObject("Nome:" + funcionario2.getNome() + " idade: " + funcionario2.getIdade() + " CPF: "
					+ funcionario2.getCpf() + " Senha: " + funcionario2.getSenha() + "\r\n");
			objOut.writeObject("Nome:" + funcionario3.getNome() + " idade: " + funcionario3.getIdade() + " CPF: "
					+ funcionario3.getCpf() + " Senha: " + funcionario3.getSenha() + "\r\n");
			objOut.writeObject("Nome:" + funcionario4.getNome() + " idade: " + funcionario4.getIdade() + " CPF: "
					+ funcionario4.getCpf() + " Senha: " + funcionario4.getSenha() + "\r\n");
			objOut.writeObject("Nome:" + funcionario5.getNome() + " idade: " + funcionario5.getIdade() + " CPF: "
					+ funcionario5.getCpf() + " Senha: " + funcionario5.getSenha() + "\r\n");
			objOut.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void lerFuncionariosSalvos() throws IOException {
		String arquivo = "C:\\Users\\ANDERSON\\git\\LabProjetoo\\SistemaBiblioteca\\Funcionarios";
		InputStream is = new FileInputStream(arquivo);
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		System.out.println(s);

		while (s != null) {
			s = br.readLine();
			System.out.println(s);
		}

	}

	public static void loginFuncionario() throws IOException {
		lerFuncionariosSalvos();
		pedirLoginFuncionario();

	}

	public static void opcoesCliente() {

		Scanner scanner = new Scanner(System.in);

		String nomeAutor = " ";
		String tituloLivro = " ";

		System.out.println("1 para consultar livros pelo nome do autor.");
		System.out.println("2 para consultar o livro pelo título.");
		System.out.println("3 para consultar a disponibilidade do livro.");
		int opcaoCliente = scanner.nextInt();

		if (opcaoCliente == 1) {
			System.out.println("Qual o nome do autor que você deseja consultar?");
			nomeAutor = scanner.nextLine();

		} else if (opcaoCliente == 2) {
			System.out.println("Qual o nome do título do livro que você deseja consultar? ");
			tituloLivro = scanner.nextLine();

		} else if (opcaoCliente == 3) {
			System.out.println("Para consultar a disponibilidade do livro você precisa dizer: ");
			System.out.println("Qual o nome do livro?");
			tituloLivro = scanner.nextLine();

			System.out.println("Qual o autor do livro?");
			nomeAutor = scanner.nextLine();

		} else {
			System.out.println("Opcão inválida.");
		}

	}

	public static void opcoesFuncionario() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("1 para cadastrar livro.");
		System.out.println("2 para editar informações de um livro.");
		System.out.println("3 para deletar um livro.");
		int opcaoFuncionario = scanner.nextInt();

		if (opcaoFuncionario == 1) {
			cadastrarLivro();
		} else if (opcaoFuncionario == 2) {

		} else if (opcaoFuncionario == 3) {

		}

	}

	public static Livro cadastrarLivro() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Qual o título do livro?");
		String nomeLivro = scanner.nextLine();

		System.out.println("Qual o ano de publicação do livro?");
		int anoPublicacao = scanner.nextInt();

		System.out.println("Qual o volume do livro?");
		int volumeLivro = scanner.nextInt();

		scanner = new Scanner(System.in);

		System.out.println("Qual a categoria do livro?");
		String categoriaLivro = scanner.nextLine();

		System.out.println("Qual o número de páginas do livro?");
		int qntPaginas = scanner.nextInt();

		Livro livro1 = new Livro(nomeLivro, anoPublicacao, volumeLivro, preencherAutor(), categoriaLivro, qntPaginas);

		return livro1;
	}

	public static Autor preencherAutor() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Qual o nome do autor do livro?");
		String nomeAutor = scanner.nextLine();

		Autor autor1 = new Autor(nomeAutor, null);

		return autor1;
	}

	public static void salvarAutor() {

	}

	public static void pedirLoginCliente() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Qual o seu nome? ");
		String nome = scanner.nextLine();

		scanner = new Scanner(System.in);

		System.out.println("Qual a sua senha?");
		String senha = scanner.nextLine();

	}

	public static void pedirLoginFuncionario() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Qual o seu nome? ");
		String nome = scanner.nextLine();

		scanner = new Scanner(System.in);

		System.out.println("Qual a sua senha?");
		String senha = scanner.nextLine();

	}

	public static void cadastroCliente() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Qual o seu nome? ");
		String nome = scanner.nextLine();

		System.out.println("Qual seu sexo?");
		char sexo = scanner.next().charAt(0);

		System.out.println("Qual sua idade?");
		int idade = scanner.nextInt();

		scanner = new Scanner(System.in);
		System.out.println("Qual seu endereço?");
		String endereco = scanner.nextLine();

		System.out.println("Qual seu telefone?");
		int telefone = scanner.nextInt();

		System.out.println("Qual seu cpf? (apenas números) ");
		String cpf = scanner.next();

		scanner = new Scanner(System.in);
		System.out.println("Qual seu email?");
		String email = scanner.nextLine();

		Cliente cliente = new Cliente(nome, sexo, idade, endereco, telefone, cpf, email);

		// if(){
		// colocar validação de cpf em um if
		// dentro do if colocar uma condição para se o cpf for válido, salvar em
		// um arquivo txt
		// codigo abaixo
		try {
			File arquivo = new File("Clientes");
			FileWriter escritor = new FileWriter(arquivo, true);

			escritor.write("Nome: " + cliente.getNome() + " Sexo: " + cliente.getSexo() + " idade: "
					+ cliente.getIdade() + " Endereço: " + cliente.getEndereco() + " Telefone: " + cliente.getTelefone()
					+ " CPF: " + cliente.getCpf() + " eMAIL: " + cliente.getEmail() + "\r\n");
			escritor.flush();
			escritor.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// } final do if
	}

}
