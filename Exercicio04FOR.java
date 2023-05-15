import java.util.Scanner;

public class Exercicio04FOR {
	//Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
	//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroDePares = sc.nextInt();
		int pares = 2;
		int primeiroNumero = 0;
		int segundoNumero = 0;
		double divisao;

		for (int i = 0; i < numeroDePares; i++) {
			primeiroNumero = sc.nextInt();
			segundoNumero = sc.nextInt();
			System.out.println();
			if (segundoNumero == 0) {
				System.out.println("divisão impossível!");
			} else {
				divisao = primeiroNumero / segundoNumero;
				System.out.println(divisao);
			}

		}

	}

}
