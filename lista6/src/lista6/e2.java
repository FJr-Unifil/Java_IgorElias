package lista6;

import java.util.Scanner;

public class e2  {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        double vetor[] = new double[5];
        double maior = 0, menor = 0;
        double media = 0;
        for (int i = 0; i < vetor.length; i++) {
        	System.out.println("Digite o "+(i+1)+"º número: ");
        	vetor[i] = ler.nextDouble();
        	if (i == 0) {
        		maior = vetor[i];
        		menor = vetor[i];
        	} else {
        		if (vetor[i] > maior) {
        			maior = vetor[i];
        		} else if (vetor[i] < menor) {
        			menor = vetor[i];
        		}
        		media = media +vetor[i];
        	}       	
        }
        for (int i = 0; i < vetor.length; i++) {
        	System.out.println("Vetor["+i+"] = "+vetor[i]);
        }
        System.out.println("O menor número foi: "+menor);
        System.out.println("O maior número foi: "+maior);
        System.out.println("A media foi "+media/5);
        ler.close();
	}
}
