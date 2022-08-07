package lista2_2;

import java.util.Scanner;

public class e5  {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
       float n;
       System.out.println("Digite um numero");
       n = ler.nextFloat();
       if (n > 0) {
    	   n = n * 2;
       } else {
    	   n = n * 3;
       }
       System.out.println("O resultado deu "+n);
	}
}
