package entidades;

public class Cliente {
	private String nome;
	private int idade;
	private int cpf;
	private String email;
	private String endereco;
	
	public Cliente ( String nome, int idade, int cpf, String email, String endereco){
		this.setNome(nome);
		this.setIdade(idade);
		this.setCpf(cpf);
		this.setEmail(email);
		this.setEndereco(endereco);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
