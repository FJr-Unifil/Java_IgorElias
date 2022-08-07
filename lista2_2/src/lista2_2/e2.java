package lista2_2;

import java.util.Scanner;

public class e2  {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        String nome=null, sexo=null, estadoC=null;
        int anos;
        System.out.println("Qual seu nome?");
        nome = ler.next();
        System.out.println("Qual seu sexo?"+"\n"+"F - Feminino"+"\n"+"M - Masculino"+"\n"+"P - Prefiro não dizer");
        sexo = ler.next();
        System.out.println("Qual seu estado civil?"+"\n"+"S - Solteiro(a)"+"\n"+"C - Casado(a)");
        estadoC = ler.next();
        if (sexo.equals("F") && estadoC.equals("C")) {
        	System.out.println("Quantos anos de casada?");
        	anos = ler.nextInt();
        	System.out.println("Parabéns pelo matrimônio. Obrigado pela pesquisa");
        } else {
        System.out.println("Obrigado pela pesquisa!");}
	}
}
