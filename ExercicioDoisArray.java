import java.util.Scanner;

public class ExercicioDoisArray {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia N números reais e armazene-os em um vetor. Em
		 * seguida: - Imprimir todos os elementos do vetor - Mostrar na tela a soma e a
		 * média dos elementos do vetor
		 */

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] vect = new int[n];
		int soma = 0;
		

		for (int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextInt();

		}

		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}

		for (int i = 0; i < vect.length; i++) {
			soma = soma + vect[i];
		}

		System.out.println("A soma dos números deu:" + soma);
		
		int media = soma / n;
		System.out.println("A média dos valores deu:" + media);

	}

}
