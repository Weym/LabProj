package entidades;

import java.util.Scanner;

public class Livro {
	public String titulo;
	public int anoPublicacao;
	public int edicao;
	public String editora;
	public String autor;
	public String categoria;
	public int numeroPaginas;

	public void cadastroLivro() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Qual o nome do titulo?");
		titulo = scanner.nextLine();

		System.out.println("Qual o ano da publicação?");
		anoPublicacao = scanner.nextInt();

		System.out.println("Qual a edição?");
		edicao = scanner.nextInt();

		System.out.println("Qual a editora?");
		setEditora(scanner.nextLine());

		System.out.println("Qual o nome do autor?");
		setAutor(scanner.nextLine());

		System.out.println("Qual o categoria do livro?");
		categoria = scanner.nextLine();

		System.out.println("Qual o número de páginas do livro?");
		numeroPaginas = scanner.nextInt();

		scanner.close();

		Livro livro = new Livro(titulo, anoPublicacao, edicao, getEditora(), getAutor(), categoria, numeroPaginas);


	}

	public Livro(String titulo, int anoPublicacao, int edicao, String editora, String autor, String categoria, int numeroPaginas) {
		this.setTitulo(titulo);
		this.setAnoPublicacao(anoPublicacao);
		this.setEdicao(edicao);
		this.setCategoria(categoria);
		this.setNumeroPaginas(numeroPaginas);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

}