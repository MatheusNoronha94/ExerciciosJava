import java.util.Scanner;

public class TransformandoCelsiusEmFahrenheit {

	public static void main(String[] args) {
		// Calculo da transposição de graus Celsius para Fahrenheit
		Scanner sc = new Scanner(System.in);
		double Celsius;
		double Fahrenheit;
		char Resposta;
		do {
			System.out.print("Digite a temperatura em Celsius para a conversão: ");
			Celsius = sc.nextDouble();
			Fahrenheit = 9.0 * Celsius / 5.0 + 32.0;
			System.out.printf("O equivalente em Fahrenheit é: %.1f%n", Fahrenheit);
			System.out.println("Gostaria de realizar a conversão mais uma vez? s(SIM) n(NÃO)");
			Resposta = sc.next().charAt(0);
		} while (Resposta != 'n');
		System.out.println("Obrigado!");
	}

}
