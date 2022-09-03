package lista6;

import java.util.Arrays;
import java.util.Scanner;

public class e5 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double vetor[] = new double[5];
		int codigo = -2;
		int j = 0;
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º número: ");
			vetor[i] = ler.nextDouble();
		}
		do {
			System.out.println("Digite uma opção" + "\n" + "1 - Para ordenar de forma crescente" + "\n"
					+ "2 - Para ordenar de forma decrescente" + "\n" + "0 - SAIR");
			codigo = ler.nextInt();
			switch (codigo) {
			case 1:
				Arrays.sort(vetor);
				for (int i = 0; i < vetor.length; i++) {
					System.out.println("Vetor[" + i + "] = " + vetor[i]);
				}
				break;

			case 2:
				for (int i = 4; i >= 0; i--) {
					System.out.println("Vetor[" + (j) + "] = " + vetor[i]);
					j++;
				}
				break;

			case 0:
				System.out.println("Código encerrado!");
				System.exit(0);
				break;

			default:
				System.out.println("Código inválido");
				break;
			}
		} while (codigo != 0);

		ler.close();
	}
}
