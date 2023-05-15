
import java.util.Scanner;

public class Execicio02FOR {

	// Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X
	// que serão lidos em seguida.
	// Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos
	// estão fora do intervalo, mostrando
	// essas informações conforme exemplo (use a palavra "in" para dentro do
	// intervalo, e "out" para fora do intervalo).

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int vezes = 5;
		int in = 0;
		int out = 0;

		for (int i = 0; i < vezes; i++) {
			int numeroPedido = sc.nextInt();
			if (numeroPedido < 10) {
				out = out + 1;
			} else if (numeroPedido > 20) {
				out = out + 1;
			} else {
				in = in + 1;
			}

		}
		if (in > 1) {
			System.out.println(in + " números dentro do intervalo!");
		} else {
			System.out.println(in + " número dentro do intervalo!");
		}
		if (out > 1) {
			System.out.println(out + " números fora do intervalo!");

		} else {
			System.out.println(out + " número fora do intervalo!");
		}

	}

}
