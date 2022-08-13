package Lista3;

import java.util.Scanner;

public class e8  {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        float[] n = new float[5];
        float media=0, soma=0;
        for (int i=0; i< n.length; i++) {
        	System.out.println("Digite o "+(i+1)+"º número:");
        	n[i] = ler.nextFloat();
        	soma = n[i] + soma;
        }
        System.out.println("A soma dos números é igual à: "+soma);
        media = soma/5;
        System.out.println("A média dos números é igual à: "+media);
	}
}
