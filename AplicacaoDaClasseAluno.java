import java.io.NotActiveException;
import java.util.Scanner;

import entidades.Aluno;

public class AplicacaoDaClasseAluno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aluno Oliver = new Aluno();
		System.out.print("Nome:");
		Oliver.nome = sc.nextLine();
		System.out.println("Nota primeiro trimestre:");
		Oliver.primeiraNota = sc.nextInt();
		System.out.println("Nota segundo trimestre:");
		Oliver.segundaNota = sc.nextInt();
		System.out.println("Nota terceiro trimestre:");
		Oliver.terceiraNota = sc.nextInt();
		System.out.println();
		
		Oliver.calculoNotaFinal();

		if (Oliver.notaFinal < 60) {
			System.out.println("Sua nota final é:" + Oliver.notaFinal);
			System.out.println("Reprovado !");
			Oliver.calculoNotaAprovacao();
			System.out.println("Faltam: " + Oliver.NotaAprovacao + " pontos para você ser aprovado.");
		} else {
			System.out.println("Sua nota final é:" + Oliver.notaFinal);
			System.out.println("Aprovado !");
			System.out.println("Parabéns");
		}
	}

}
