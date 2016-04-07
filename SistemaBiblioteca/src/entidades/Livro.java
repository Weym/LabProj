package entidades;

import java.io.Serializable;

public class Livro implements Serializable{
	private String titulo;
	private Autor autor;
	//private String editora;
	private int numeroPaginas;
	private int anoPublicacao;
	private int edicao;
	private String categoria;
	private int exemplares;
	
	public Livro(){
		
	}
	
	public Livro(String titulo, int numeroPaginas, int exemplares, Autor autor){
		this.setTitulo(titulo);
		this.setNumeroPaginas(numeroPaginas);
		this.setExemplares(exemplares);
		this.setAutor(autor);
		
	}
	
	public Livro (String titulo, int anoPublicacao, int edicao, Autor autor, String categoria, int numeroPaginas){
		this.setTitulo(titulo);
		this.setAnoPublicacao(anoPublicacao);
		this.setedicao(edicao);
		this.setAutor(autor);
		this.setCategoria(categoria);
		this.setNumeroPaginas(numeroPaginas);
	}
	
	public String getTitulo(){
		return titulo;
	}
	
	public void setTitulo(String titulo){
		this.titulo = titulo;
	}
	
	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public int getedicao() {
		return edicao;
	}

	public void setedicao(int edicao) {
		this.edicao = edicao;
	}

	public Autor getAutor(){
		return autor;
	}

	public void setAutor(Autor autor){
		this.autor = autor;
	}
	
	public String getCategoria(){
		return categoria;
	}
	
	public void setCategoria(String categoria){
		this.categoria = categoria;
	}
	
	public int getNumeroPaginas(){
		return numeroPaginas;
	}
	
	public void setNumeroPaginas(int numeroPaginas){
		this.numeroPaginas = numeroPaginas;
	}

	public int getExemplares() {
		return exemplares;
	}

	public void setExemplares(int exemplares) {
		this.exemplares = exemplares;
	}
	
	public String toString(){
		return "Título: " + titulo + ", " + numeroPaginas + "p, " + " exemplares: " +  exemplares + ", " + autor;
	}
}