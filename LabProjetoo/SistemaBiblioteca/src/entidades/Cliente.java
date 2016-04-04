package entidades;

import java.io.Serializable;

public class Cliente implements Serializable {
	private String nome;
	private char sexo;
	private int idade;
	private String endereco;
	private int telefone;
	private String cpf;
	private String email;
	
	public Cliente ( String nome, char sexo, int idade, String endereco, int telefone, String cpf, String email){
		this.setNome(nome);
		this.setSexo(sexo);
		this.setIdade(idade);
		this.setEndereco(endereco);
		this.setTelefone(telefone);
		this.setCpf(cpf);
		this.setEmail(email);
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf2) {
		this.cpf = cpf2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
