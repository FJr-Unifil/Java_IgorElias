package lista6;

import java.util.Scanner;

public class e4  {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int vetor[] = new int[20];
		int cont = 0;
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o "+(i+1)+"º número:");
			vetor[i] = ler.nextInt();
		}
		for (int i = 0; i < vetor.length-1; i++) {
			for (int j = i+1; j < vetor.length; j++) {
				if (vetor[i] == vetor[j]) {
					cont++;
					break;
				}
			}
			if (cont == 0) {
				System.out.println("Vetor["+i+"] = "+vetor[i]);
			}
			cont = 0;
		}
       ler.close();
	}
}
