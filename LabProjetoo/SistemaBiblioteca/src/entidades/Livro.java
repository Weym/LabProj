package entidades;

public class Livro {
	private String titulo;
	private int anoPublicacao;
	private int volume;
	private Autor autor;
	private String categoria;
	private int numeroPaginas;
	
	public Livro (String titulo, int anoPublicacao, int volume, Autor autor, String categoria, int numeroPaginas){
		this.setTitulo(titulo);
		this.setAnoPublicacao(anoPublicacao);
		this.setVolume(volume);
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

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
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
}