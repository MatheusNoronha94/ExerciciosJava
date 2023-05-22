import java.util.Scanner;

import entidades.Pensionato;

public class AplicacaoPensionato {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		Pensionato[] quartosPensao = new Pensionato[10];

		System.out.println("Quantos alunos vão ser hospedados na pensão?");
		n = sc.nextInt();
		int[] quantidadeHospedes = new int[n];
		for (int i = 0; i < quantidadeHospedes.length; i++) {
			System.out.println("Hospedagem " + (i + 1));
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Quarto: ");
			int room = sc.nextInt();
			quartosPensao[room] = new Pensionato(nome, email, room);

		}
		System.out.println("Quartos ocupados: ");
		for (int i = 0; i < quartosPensao.length; i++) {
			if (quartosPensao[i] != null) {
				System.out.println(quartosPensao[i]);
				
			}
		}
	}

}
