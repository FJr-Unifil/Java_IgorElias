package lista2_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class e12  {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
        float n1, n2, n3, me, ma;
        int id;
        String nota = null;
        System.out.println("Escreva seu número de identifiação");
        id = ler.nextInt();
        System.out.println("Escreva a 1º nota");
        n1 = ler.nextFloat();
        System.out.println("Escreva a 2º nota");
        n2 = ler.nextFloat();
        System.out.println("Escreva a 3º nota");
        n3 = ler.nextFloat();
        me = (float) ((n1 + n2 + n3)/3);
        ma = (float) (((n1+n2)*2+(n3*3)+me)/7);
        if (ma >= 90) {
        	nota = "A";
        } else if (ma >= 75 && ma < 90) {
        	nota = "B";
        } else if (ma >= 60 && ma < 75) {
        	nota = "C";
        } else if (ma >= 40 && ma < 60) {
        	nota = "D";
        } else if (ma < 40) {
        	nota = "E";
        }
        System.out.println("As notas do aluno "+id+ " foram:"+"\n"+"Nota 1: "+n1+" | Nota 2: "+n2+" | Nota 3: "+n3);
        System.out.println("A média dos exercícios foi de: "+df.format(me));
        System.out.println("A média da de aproveitamento foi de: "+df.format(ma)+" gerando o conceito "+nota);
	}
}
