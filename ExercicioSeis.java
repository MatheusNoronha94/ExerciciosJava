import java.util.Scanner;

public class ExercicioSeis {

	public static void main(String[] args) {
		// Escreva um programa que repita a leitura de uma senha até que ela seja
		// válida. Para cada leitura de senha
		// incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for
		// informada corretamente deve ser
		// impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que
		// a senha correta é o valor 2002.

		Scanner sc = new Scanner(System.in);
		int SenhaCorreta = 2002;
		int TentativaSenha;

		System.out.println("Digite sua senha:");
		TentativaSenha = sc.nextInt();

		while (TentativaSenha != SenhaCorreta) {
			System.out.println("Senha Incorreta!");
			System.out.println("Tente Novamente:");
			TentativaSenha = sc.nextInt();
		
		}
		System.out.println("Acesso autorizado.");
		
		sc.close();

	}

	git config --global user.email "you@example.com"

}
