import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		// Fazer um programa que leia o número de um funcionário, seu número de horas
		// trabalhadas, o valor que recebe por
		// hora e calcula o salário desse funcionário. A seguir, mostre o número e o
		// salário do funcionário, com duas casas
		// decimais.
		Scanner sc = new Scanner(System.in);
		int NumeroFuncionario, HorasTrabalhadas, ValorHora, Salario;

		System.out.println("Qual seu número de matrícula?");
		NumeroFuncionario = sc.nextInt();
		System.out.println("Quantas horas você trabalhou esse mês?");
		HorasTrabalhadas = sc.nextInt();
		System.out.println("Qual o valor da sua hora?");
		ValorHora = sc.nextInt();

		Salario = HorasTrabalhadas * ValorHora;
		System.out.println("Matrícula:" + NumeroFuncionario);
		System.out.println("Seu salário foi calculado em: R$" + Salario);
		
		sc.close();
	}

}
