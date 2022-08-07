package lista2_2;

import java.util.Scanner;

public class e10  {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        float l1, l2, l3;
        System.out.println("Digite o primeiro lado");
        l1 = ler.nextFloat();
        System.out.println("Digite o segundo lado");
        l2 = ler.nextFloat();
        System.out.println("Digite o terceiro lado");
        l3 = ler.nextFloat();
        if (l1 == l2 && l1 != l3 || l2 == l3 && l2 != l1  || l2 == l1 && l2 != l3 || l3 == l1 && l3 != l2 || l3 == l2 && l3 != l1 ) {
        	System.out.println("Trata-se de um triângulo isósceles.");
        } else if (l1 == l2 && l1 == l3) {
        	System.out.println("Trata-se de um triângulo equilátero.");
        } else {
        	System.out.println("Trata-se de um triângulo escaleno.");
        }
	}
}
