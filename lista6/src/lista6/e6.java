package lista6;

import java.util.Scanner;

public class e6  {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int vetor[] = new int[10];
		int x = 0;
		for (int i = 0; i< vetor.length; i++) {
			System.out.println("Digite o "+(i+1)+"º número: ");
			vetor[i] = ler.nextInt();
		}
		System.out.println("Digite o número para procurar múltiplos");
		x = ler.nextInt();
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % x == 0) {
				System.out.println("Vetor["+i+"] = "+vetor[i]);
			}
		}
        ler.close();
	}
}
