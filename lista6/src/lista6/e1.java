package lista6;

import java.util.Scanner;

public class e1  {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double vetor[] = new double[10];
		int negativo = 0;
		int positivo = 0;
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o "+(i+1)+"º número");
			vetor[i] = ler.nextDouble();
			if (vetor[i] >= 0) {
				positivo++;
			} else {
				negativo++;
			}
		}
		System.out.println("Houve "+negativo+" números negativos");
		System.out.println("Houve "+positivo+" números positivos");
        ler.close();
	}
}
