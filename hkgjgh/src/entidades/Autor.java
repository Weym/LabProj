package entidades;

import java.util.Scanner;

public class Autor {
	private String nome;
	private Livro livro;
	
	
	public void cadastrarAutor(){
		
		Autor autor = new Autor();
	
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Nome do autor: ");
		nome = scanner.nextLine();

		System.out.println("Livro do autor: ");
		autor.livro.titulo = scanner.next();
		
	}
	
	
	

	public Autor (String nome, Livro livro){
		this.setNome(nome);
		this.setLivro(livro);
	}

	public Autor(){
		
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
}