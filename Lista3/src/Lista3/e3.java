package Lista3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class e3  {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        String nome, sexo, estadoC;
        int idade;
        float salario;
        DecimalFormat df = new DecimalFormat("0.00");
        do {
        System.out.println("Escreva seu nome");
        nome = ler.next();
        if (nome.length() < 3) {
        	System.out.println("Mínimo de 3 caracteres");
        }
        } while(nome.length() < 3);
        do {
        	System.out.println("Escreva sua idade");
        	idade = ler.nextInt();
        	if (idade < 0 || idade > 150) {
        		System.out.println("Escreva um valor entre 0 e 150");
        	}
        } while (idade < 0 || idade > 150);
        do {
        	System.out.println("Escreva seu salário");
        	salario = ler.nextFloat();
        	if (salario < 0) {
        		System.out.println("Escreva um valor maior ou igual a 0");
        	}
        } while (salario < 0);
        do {
        	System.out.println("Escreva seu sexo"+"\n"+"m - masculino"+"\n"+"f - feminino");
        	sexo = ler.next();
        	sexo = sexo.toLowerCase();
        	if (!sexo.equals("m") && !sexo.equals("f")) {
        		System.out.println("Insira um caractere válido");
        	}
        } while (!sexo.equals("m") && !sexo.equals("f"));
        do {
        	System.out.println("Qual seu estado civil?"+"\n"+"s - solteiro"+"\n"+"c - casado"+"\n"+"v - viúvo"+"\n"+"d - divorciado");
        	estadoC = ler.next();
        	estadoC = estadoC.toLowerCase();     
        	if (!estadoC.equals("s") && !estadoC.equals("c") && !estadoC.equals("v") && !estadoC.equals("d")) {
        		System.out.println("Insira um caractere válido");
        	}
        } while (!estadoC.equals("s") && !estadoC.equals("c") && !estadoC.equals("v") && !estadoC.equals("d"));
        
        System.out.println("Confirme seus dados!");
        System.out.println("Seu nome é: "+nome);
        System.out.println("Você tem "+idade+" anos");
        System.out.println("Você recebe R$"+df.format(salario));
        System.out.println("Você é do sexo "+sexo);
        System.out.println("Seu estado civil é: "+estadoC);
	}
}
