import java.util.Scanner;

import entidades.Funcionario;

public class AplicacaoDaClasseFuncionario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Funcionario Oliver = new Funcionario();
		System.out.print("Nome: ");
		Oliver.nome = sc.nextLine();
		System.out.print("Salário: ");
		Oliver.salarioBruto = sc.nextDouble();
		System.out.println("Taxa do salário: ");
		Oliver.taxa = sc.nextDouble();
		
		System.out.println("Salário calculado em: " + Oliver );
		System.out.println();
		System.out.println("Qual a porcentagem de aumento do seu salário?");
		double calculoPorcentagem = sc.nextDouble();
		Oliver.incrementarSalario(calculoPorcentagem);
		
		System.out.println("Atualização de cálculo: "+Oliver);

	}

}
