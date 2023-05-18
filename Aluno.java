package entidades;

public class Aluno {
	public String nome;
	public int primeiraNota;
	public int segundaNota;
	public int terceiraNota;
	public int notaFinal;
	public int NotaAprovacao;
	
	public int calculoNotaFinal() {
		return this.notaFinal=primeiraNota + segundaNota + terceiraNota;
	}
	
	public int calculoNotaAprovacao() {
		return this.NotaAprovacao=60-this.notaFinal;
	}
	
	public String toString() {
		return nome
				+ notaFinal;
				
	}
}
