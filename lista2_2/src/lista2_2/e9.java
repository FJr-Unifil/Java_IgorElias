package lista2_2;

import java.util.Scanner;

public class e9 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String sexo;
		float altura, pesoI;
		System.out.println("Qual seu sexo?" + "\n" + "M - Masculino" + "\n" + "F - Feminino");
		sexo = ler.next();
		System.out.println("Qual sua altura?");
		altura = ler.nextFloat();
		if (sexo.equals("M")) {
			pesoI = (float) ((72.7 * altura)-58);
			System.out.println("Seu peso ideal é: "+pesoI+ " kg.");
		} else {
			pesoI = (float) (62.1 * altura)-44;
			System.out.println("Seu peso ideal é: "+pesoI+" kg.");
		}
	}
}
