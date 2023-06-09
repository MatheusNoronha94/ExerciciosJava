import java.util.Scanner;

public class Exercicio03FOR {
	// Leia 1 valor inteiro N, que representa o número de casos de teste que vem a
	// seguir. Cada caso de teste consiste
	// de 3 valores reais, cada um deles com uma casa decimal. Apresente a média
	// ponderada para cada um destes
	// conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo
	// valor tem peso 3 e o terceiro valor tem
	// peso 5.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numerosDeCasosDeTeste = 3;
		double numeroUm;
		double numeroDois;
		double numeroTres;
		double media;

		for (int i = 0; i < numerosDeCasosDeTeste; i++) {
			numeroUm = sc.nextDouble();
			numeroDois = sc.nextDouble();
			numeroTres = sc.nextDouble();
			media = (numeroUm * 2.0 + numeroDois * 3.0 + numeroTres * 5.0) / 10;
			System.out.printf("%.1f%n", media);
			System.out.println();
		}

	}

}
