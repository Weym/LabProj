package entidades;

import java.util.ArrayList;

public class Biblioteca {

	String nome;
	ArrayList<Livro> livros;
	ArrayList<Cliente> clientes;

	public Biblioteca(String nome) {
		this.nome = nome;
		livros = new ArrayList<Livro>();
		clientes = new ArrayList<Cliente>();
	}

	public ArrayList<Livro> getLivros() {
		return livros;
	}

	public ArrayList<Cliente> getPessoas() {
		return clientes;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void addLivro(Livro l1) {
		this.livros.add(l1);
	}

	public void removeLivro(Livro l1) {
		this.livros.remove(l1);
	}

	public void addPessoa(Pessoa p1) {
		this.clientes.add(p1);
		
	}

	public void removeLivro(Pessoa p1) {
		this.clientes.remove(p1);
		
	}



	public boolean emprestimo(Livro l1, Cliente p1) {
		int livrosEmprestados = this.getLivrosPorPessoa(p1).size();
		if (l1.getCliente() == null && (livrosEmprestados < p1.getMaxLivros())){
			l1.setPessoa(p1);
			return true;
		}
			else{
				return false;
			}
	}
	
	public boolean devolucao(Livro l1) {
		if (l1.getCliente() !=null){
			l1.setCliente(null);
			return true;
		}
		else{
			return false;
		}
	}

	public ArrayList<Livro> getLivrosPorPessoa(Cliente p1) {
		ArrayList<Livro> resultado = new ArrayList<Livro>();
		for (Livro umLivro : this.getLivros()){
			if ((umLivro.getCliente() != null) && (umLivro.getCliente().getNome().equals(p1.getNome()))){
				resultado.add(umLivro);
			}
		}
		return resultado;
	}

	public ArrayList<Livro> getLivrosDisponiveis(Cliente p1) {
		ArrayList<Livro> resultado = new ArrayList<Livro>();
		for (Livro umLivro : this.getLivros()){
			if(umLivro.getCliente() == null){
				resultado.add(umLivro);
			}
		}
		return resultado;
	}

	public ArrayList<Livro> getLivrosIndisponiveis() {
		ArrayList<Livro> resultado = new ArrayList<Livro>();
		for (Livro umLivro : this.getLivros()){
			if(umLivro.getPessoa() != null){
				resultado.add(umLivro);
			}
		}
		return resultado;
	}
	
	public String toString(){
		return getNome() + ": " + this.getLivros().size() + " Livros; " + this.getPessoas().size() + " Pessoas.";
	}
	
	
	public static void main (String[]args){
		Biblioteca testeBiblioteca = new Biblioteca("Central");
		
		//Cria Livros
		Livro l1 = new Livro ("O príncipe e o pobre");
		l1.setAutor("Mark Twain");
		Livro l2 = new Livro("O livro dos cinco elementos");
		l2.setAutor("Myamoto Musashi");
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Lisa Simpson");
		Pessoa p2 = new Pessoa();
		p2.setNome("Bart Simpson");

		testeBiblioteca.addLivro(l1);
		testeBiblioteca.addLivro(l2);
		testeBiblioteca.addPessoa(p1);
		testeBiblioteca.addPessoa(p2);
		
		System.out.println("Criada a nova Biblioteca!");
		testeBiblioteca.imprimeStatus();
		
		System.out.println("Empresta O príncipe e o pobre para Lisa Simnpson.");
		testeBiblioteca.emprestimo(l1, p1);
		testeBiblioteca.imprimeStatus();
		
		System.out.println("Faz mais algumas manutenções.");
		testeBiblioteca.devolucao(l1);
		testeBiblioteca.emprestimo(l2, p2);
		testeBiblioteca.imprimeStatus();
	}

	private void imprimeStatus() {
		System.out.println("Status da Biblioteca:\n" + this.toString());
		
		for(Livro umLivro : this.getLivros()){
			System.out.println(umLivro);
		}
		
		for(Pessoa umaPessoa : this.getPessoas()){
			int contador = this.getLivrosPorPessoa(umaPessoa).size();
			System.out.println(umaPessoa + " tem " + contador + " dos meus livros");
		}
		
		System.out.println("Livros disponíveis: " + this.getLivrosIndisponiveis().size());
		System.out.println(" --- Fim do Relatório de Status --- ");
		
	}

	


}
