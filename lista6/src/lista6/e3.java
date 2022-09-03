package lista6;

import java.util.Scanner;

public class e3  {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int vetor[] = new int[10];
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o "+(i+1)+"º número: ");
			vetor[i] = ler.nextInt();
		}
		for (int i = 0; i < vetor.length; i++) {
			for (int j = i+1; j < vetor.length; j++) {
				if (vetor[j] == vetor[i]) {
					System.out.println("Vetor["+i+"] e Vetor["+j+"] = "+vetor[j]);
				}
			}
		}
        ler.close();
	}
}
