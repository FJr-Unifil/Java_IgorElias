package Lista3;

import java.util.Scanner;

public class e4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double[] populacao = new double[2];
		int ano;
		double[] taxaC = new double[2];
		ano = 1;
		populacao[0] = 80000;
		taxaC[0] = 3;
		populacao[1] = 200000;
		taxaC[1] = (double) (1.5);
		if ((populacao[0] + (taxaC[0] * populacao[0])) < populacao[1] + (taxaC[1] * populacao[1])) {
			System.out.println("A população de A nunca passará a população de B");
		} else {
			while (populacao[1] > populacao[0]) {
				taxaC[0] = taxaC[0] / 100;
				populacao[0] = (double) (populacao[0] + (taxaC[0] * populacao[0]));
				taxaC[1] = taxaC[1] / 100;
				populacao[1] = (double) (populacao[1] + (taxaC[1] * populacao[1]));
				ano = ano + 1;
				if (populacao[1] < populacao[0]) {
					break;
				}
			}
			System.out.println("A população de A levará "+ano+" anos para passar a população de B");
		}
	}
}