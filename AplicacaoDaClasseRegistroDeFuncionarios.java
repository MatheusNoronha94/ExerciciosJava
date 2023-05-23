import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import entidades.RegistroDeFuncionarios;

public class AplicacaoDaClasseRegistroDeFuncionarios {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos funcionários vão ser registrados?");
		int n = sc.nextInt();
		List<RegistroDeFuncionarios> list = new ArrayList<>(n);

		for (int i = 0; i < n; i++) {

			System.out.println("Registro " + (i + 1) + " :");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Salário: ");
			double salario = sc.nextDouble();
			RegistroDeFuncionarios registro = new RegistroDeFuncionarios(id, nome, salario);
			list.add(registro);
		}

		System.out.print("Qual o id do funcionário que vai receber o aumento?");
		int idBusca = sc.nextInt();
		Integer posicaoEncontrada = posicao(list, idBusca);
		if (posicaoEncontrada == null) {
			System.out.println();
			System.out.print("Id digitado incorretamente, tente novamente");
			System.out.println();
			System.out.println("---------------------");
			
		} else {
			System.out.println();
			System.out.println("Qual valor da porcentagem do aumento?");
			double aumentoSolicitado = sc.nextDouble();
			list.get(posicaoEncontrada).calculaSalario(aumentoSolicitado);
			for (RegistroDeFuncionarios obj : list) {
				System.out.println(obj);
				
			}
		}

		
	}

	public static Integer posicao(List<RegistroDeFuncionarios> list, int id) {

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
