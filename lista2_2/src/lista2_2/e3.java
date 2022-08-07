package lista2_2;

import java.util.Scanner;

public class e3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a = 0, b = 0, c = 0, delta=0;
		float res, res2;
		do {
			System.out.println("Digite o valor de A");
			a = ler.nextInt();
			if (a == 0) {
				System.out.println("Quando A é igual à 0 a equação não é de segundo grau");
				break;
			} else {
				System.out.println("Digite o valor de B");
				b = ler.nextInt();
				System.out.println("Digite o valor de C");
				c = ler.nextInt();
				delta =(int) (Math.pow(b, 2))-(4*a*c);
				System.out.println("Delta = "+delta);
				if (delta < 0) {
					System.out.println("A equação não possui raízes reais, pois o delta é negativo.");
					break;
				} else if (delta == 0) {
					System.out.println("A equação possui apenas uma raiz real, pois o valor de delta é zero.");
					res =(float) (-(b)/(2*a));
					System.out.println("O valor da expressão "+a+"x2 "+" + "+b+" x + "+c+"\n"+"x = "+ res);
				} else {
					System.out.println("A expressão possui duas raízes reais, pois delta é maior que 0");
					res =(float) ((-(b)+Math.sqrt(delta))/(2*a));
					res2 = (float) ((-(b)-Math.sqrt(delta))/(2*a));
					System.out.println("Os valores da expressão "+a+"x2 "+" + "+b+" x + "+c+"\n"+"x1 = "+ res+ " | x2 = "+res2);
					break;
				}
			}
		} while (a != 0);
	}
}