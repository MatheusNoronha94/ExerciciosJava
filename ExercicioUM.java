import java.util.Scanner;

public class ExercicioUM {

	public static void main(String[] args) {
		//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
		//mensagem explicativa, conforme exemplos.
		Scanner sc = new Scanner(System.in);
		int x,y;
		x = sc.nextInt();
		y = sc.nextInt();
		int soma=x+y;
		System.out.println("A soma dos valores é igual a "+ soma);
		sc.close();
	}

}
