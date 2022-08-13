package Lista3;

import java.util.Scanner;

public class e1  {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        float nota;
        do {
        	System.out.println("Digite sua nota");
        	nota = ler.nextFloat();
        } while (nota < 0 || nota > 10);
	}
}
