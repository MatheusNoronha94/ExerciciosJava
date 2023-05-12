import java.util.Locale;
import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
		// valor unitário de cada peça 1, o
		// código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
		// Calcule e mostre o valor a ser pago

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int CodigoUm, CodigoDois, QuantidadeUm, QuantidadeDois;
		double PrecoUm, PrecoDois, Total;

		CodigoUm = sc.nextInt();
		QuantidadeUm = sc.nextInt();
		PrecoUm = sc.nextDouble();
		CodigoDois = sc.nextInt();
		QuantidadeDois = sc.nextInt();
		PrecoDois = sc.nextDouble();

		Total = PrecoUm * QuantidadeUm + PrecoDois * QuantidadeDois;

		System.out.printf("Valor a pagar: R$ %.2f%n", Total);

		sc.close();
	}

}
