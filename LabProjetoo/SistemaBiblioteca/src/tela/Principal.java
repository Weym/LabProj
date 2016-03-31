package tela;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import entidades.Autor;
import entidades.Funcionario;
import entidades.Livro;

public class Principal {
	public static void main(String[] args) throws IOException {
		Autor autor = null;
		Livro livro = null;
		Funcionario funcionario = null;


	}

	public static void salvarFuncionarios(Funcionario funcionario) {
		
		Funcionario funcionario1 = new Funcionario("Anderson Gonçalves", 21, "12365498710");
		Funcionario funcionario2 = new Funcionario("Weydson Marinho", 23, "15476982341");
		Funcionario funcionario3 = new Funcionario("Rosemberg Roberto", 3, "98647531250");
		Funcionario funcionario4 = new Funcionario("Marina Adolfina", 27, "64789231475");
		Funcionario funcionario5 = new Funcionario("Marcela Oliveira", 21, "65437281904");

		try {
			FileOutputStream out = new FileOutputStream("Funcionarios");
			ObjectOutputStream objOut = new ObjectOutputStream(out);

			objOut.writeObject(funcionario1);
			objOut.writeObject(funcionario2);
			objOut.writeObject(funcionario3);
			objOut.writeObject(funcionario4);
			objOut.writeObject(funcionario5);
			objOut.close();

			System.out.println("ESCREVI");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void lerFuncionariosSalvos(Funcionario funcionario) throws IOException {
		String arquivo = "C:\\Users\\ANDERSON\\git\\LabProjetoo\\SistemaBiblioteca\\Funcionarios";
		InputStream is = new FileInputStream(arquivo);
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();

		while (s != null) {
			System.out.println(s);
			s = br.readLine();
		}

	}

	public static void clienteOuFuncionario(Autor autor, Livro livro) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite 1 se você for cliente. ");
		System.out.println("Digite 2 se você for funcionário.");
		int clienteFuncionario = scanner.nextInt();

		if (clienteFuncionario == 1) {
			System.out.println("Suas opções como cliente são: ");
			opcoesCliente();

		} else if (clienteFuncionario == 2) {
			System.out.println("Suas opções como funcionário são: ");
			opcoesFuncionario(autor, livro);
		} else {
			System.out.println("Opção inválida.");
		}

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

	public static void opcoesFuncionario(Autor autor, Livro livro) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("1 para cadastrar livro.");
		System.out.println("2 para editar informações de um livro.");
		System.out.println("3 para deletar um livro.");
		int opcaoFuncionario = scanner.nextInt();

		if (opcaoFuncionario == 1) {
			cadastrarLivro(autor, livro);
		} else if (opcaoFuncionario == 2) {

		} else if (opcaoFuncionario == 3) {

		}

	}

	public static Livro cadastrarLivro(Autor autor, Livro livro) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Qual o título do livro?");
		String nomeLivro = scanner.nextLine();

		System.out.println("Qual o ano de publicação do livro?");
		int anoPublicacao = scanner.nextInt();

		System.out.println("Qual o volume do livro?");
		int volumeLivro = scanner.nextInt();

		preencherAutor(autor);

		scanner = new Scanner(System.in);

		System.out.println("Qual a categoria do livro?");
		String categoriaLivro = scanner.nextLine();

		System.out.println("Qual o número de páginas do livro?");
		int qntPaginas = scanner.nextInt();

		Livro livro1 = new Livro(nomeLivro, anoPublicacao, volumeLivro, autor, categoriaLivro, qntPaginas);

		return livro1;
	}

	public static Autor preencherAutor(Autor autor) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Qual o nome do autor do livro?");
		String nomeAutor = scanner.nextLine();

		Autor autor1 = new Autor(nomeAutor, null);

		return autor1;
	}
}
