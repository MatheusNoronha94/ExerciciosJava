package entidades;

public class RegistroDeFuncionarios {
	private Integer id;
	private String nome;
	private Double salario;

	public void calculaSalario(double porcentagem) {
		double calculoValorPorcentagem = (porcentagem / 100.00) * salario;
		salario = salario + calculoValorPorcentagem;
	}

	public RegistroDeFuncionarios(Integer id, String nome, Double salario) {

		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public String toString() {
		return "id: " + id + ", Nome: " + nome + ", Salario: " + salario;

	}
}
