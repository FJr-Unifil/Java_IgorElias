package lista2_2;

import java.util.Scanner;

public class e4  {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        float a,b;
        double c;
        System.out.println("Digite o valor a");
        a = ler.nextFloat();
        System.out.println("Digite o valor b");
        b = ler.nextFloat();
        if (a == b) {
        	c = a+b;
        } else {
        	c = a*b;
        }
        System.out.println("C = "+c);
	}
}

