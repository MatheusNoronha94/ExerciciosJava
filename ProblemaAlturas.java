package entidades;

public class ProblemaAlturas {
	/*
	 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme
	 * exemplo. Depois, mostrar na tela a altura média das pessoas
	 */

	private String nome;
	private int idade;
	private double altura;

	public ProblemaAlturas(String nome, int idade, double altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
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

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	

}
