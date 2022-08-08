package lista2_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class e13  {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
        int lado;
        float medida;
        double area;
        System.out.println("Quantos lados tem o polígono?");
        lado = ler.nextInt();
        System.out.println("Qual a medida de seu lado?");
        medida = ler.nextFloat();
        if (lado == 3) {
        	area = ((Math.pow(medida, 2))*(Math.sqrt(3)))/4;
        	System.out.println("Trata-se de um triângulo.");
        	System.out.println("Área = "+df.format(area)+" cm2");
        } else if (lado == 4) {
        	area = Math.pow(medida, 2)/2;
        	System.out.println("Trata-se de um quadrado");
        	System.out.println("Área = "+df.format(area)+" cm2");
        } else if (lado == 5) {
        	System.out.println("Trata-se de um pentágono.");
        }
	}
}


