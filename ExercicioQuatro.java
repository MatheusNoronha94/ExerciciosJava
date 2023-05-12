import java.util.Scanner;
public class ExercicioQuatro {

	public static void main(String[] args) {
		//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		
		Scanner sc = new Scanner(System.in);
		int ValorDigitado;
		System.out.println("Digite um número:");
		ValorDigitado=sc.nextInt();
		if (ValorDigitado>0) {
			System.out.println(ValorDigitado+" é um número positivo!");
		}else if (ValorDigitado==0) {
			System.out.println(ValorDigitado+" é um número neutro!");
		}else {
			System.out.println(ValorDigitado+" é um número negativo");
		}
		
		sc.close();
	}

}
