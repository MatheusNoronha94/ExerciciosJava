package entidades;

public class Pensionato {
	private String nome;
	private String email;
	private int quarto;

	public Pensionato(String nome, String email, int quarto) {
		this.nome = nome;
		this.email = email;
		this.quarto = quarto;
	}

	public String toString() {
		return quarto
			+ " : "
			+ nome
			+ " , "
			+ email;
				
	}

}
