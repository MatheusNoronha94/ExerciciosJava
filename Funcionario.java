package entidades;

public class Funcionario {
	public String nome;
	public double salarioBruto;
	public double taxa;

	public double salarioLiquido() {
		return this.salarioBruto - taxa;
	}
	public void incrementarSalario(double porcentagem) {
		this.salarioBruto = salarioBruto+((porcentagem/100)*salarioBruto);
	}
	public String toString() {
		return nome
				+ ", R$ "
				+ String.format("%.2f", salarioLiquido())
				+ ".";
	}
}
