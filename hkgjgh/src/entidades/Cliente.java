package entidades;

import java.util.Scanner;

public class Cliente {
	private String nome;
	private char sexo;
	private int idade;
	private String endereco;
	private int telefone;
	private int cpf;
	private String email;
	
	public void cadastrarCliente(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nome: ");
		nome = scanner.nextLine();
		
		System.out.println("Sexo: ");
		sexo = scanner.next().charAt(0);
		
		System.out.println("Idade:");
		idade = scanner.nextInt();
		
		System.out.println("Endereço: ");
		endereco = scanner.nextLine();
		
		System.out.println("Telefone: ");
		telefone = scanner.nextInt();
		
		System.out.println("CPF: ");
		cpf = scanner.nextInt();
		
		System.out.println("Email: ");
		email = scanner.next();
		
		
	}
	
	public Cliente ( String nome, char sexo, int idade, String endereco, int telefone, int cpf, String email){
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
	
}
