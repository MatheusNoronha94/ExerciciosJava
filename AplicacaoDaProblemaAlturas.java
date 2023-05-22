import java.util.Scanner;

import entidades.ProblemaAlturas;

public class AplicacaoDaProblemaAlturas {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme
		 * exemplo. Depois, mostrar na tela a altura média das pessoas,
		 */

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double soma=0.0;
		ProblemaAlturas[] vect = new ProblemaAlturas[n];
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Nome: ");
			String nome = sc.next();
			System.out.println("Idade: ");
			int idade = sc.nextInt();
			System.out.println("Altura: ");
			double altura = sc.nextDouble();
			System.out.println();
			vect[i]=new ProblemaAlturas(nome, idade, altura);
		}
		for (int i = 0; i < vect.length; i++) {
			soma=soma+vect[i].getAltura();
		}
		double media=soma/n;
		System.out.printf("Média das alturas: %.2f%n" , media);
		
	}

}
