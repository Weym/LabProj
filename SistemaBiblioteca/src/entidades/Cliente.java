package entidades;

import java.io.Serializable;

public class Cliente implements Serializable {
	private String nome;
	private char sexo;
	private int idade;
	private String telefone;
	private String cpf;
	
	public Cliente(){
		
	}
	
	public Cliente (String nome, char sexo, int idade, String telefone, String cpf){
		this.setNome(nome);
		this.setSexo(sexo);
		this.setIdade(idade);
		this.setTelefone(telefone);
		this.setCpf(cpf);
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


	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf2) {
		this.cpf = cpf2;
	}
	
	public String toString(){
		return "\nNome: " + getNome() + "\nSexo: " + getSexo() + "\nIdade: " + getIdade() + "\nTelefone: " + getTelefone() + "\nCpf: " + getCpf() + "\n";
	}

}
