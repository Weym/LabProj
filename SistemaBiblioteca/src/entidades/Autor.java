package entidades;

import java.io.Serializable;

public class Autor implements Serializable {
	private String nome;
	private String livro;

	public Autor (String nome){
		this.setNome(nome);
	}
	
	public Autor (String nome, String livro){
		this.setNome(nome);
		this.setLivro(livro);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLivro() {
		return livro;
	}

	public void setLivro(String livro) {
		this.livro = livro;
	}
	
	public String toString(){
		return nome;
	}
}