import java.util.Scanner;
public class Exercicio05FOR {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha um número e eu falo todos os seus divisores!");
		int NumeroEscolhido=sc.nextInt();
		
		for (int i = 1; i <=NumeroEscolhido; i++) {
			if (NumeroEscolhido%i == 0) {
				System.out.println(i);
				
			}
		}
	}

}
