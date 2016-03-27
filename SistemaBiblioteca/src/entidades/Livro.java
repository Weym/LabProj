package entidades;

public class Livro {
	private String nome;
	private Autor autor;
	private String descricao;
	private String categoria;
	private int numeroPaginas;
	
	public Livro (String nome, Autor autor, String descricao, String categoria, int numeroPaginas){
		this.nome = nome;
		this.autor = autor;
		this.descricao = descricao;
		this.categoria = categoria;
		this.numeroPaginas = numeroPaginas;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public Autor getAutor(){
		return autor;
	}
	
	public void setAutor(Autor autor){
		this.autor = autor;
	}
	
	public String getDescricao(){
		return descricao;
	}
	
	public void setDescricao(String descricao){
		this.descricao = descricao;
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
}