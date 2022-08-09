# Java_IgorElias
Destinado a tarefas/trabalhos da matéria de introdução a linguagem de programação.



package Petri_01_08;

import java.util.Scanner;

public class vetor_matriz {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] vetor = new int[5];
		String[] vetor2 = new String[1];
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Escreva " + (i + 1) + "º numero");
			vetor[i] = ler.nextInt();}
		do {
		System.out.println("Escolha qual opção desejada" + "\n" + "C - Ordenar crescentemente" + "\n"
				+ "D - Ordenar decrescentemente");
		vetor2[0] = ler.next();
		vetor2[0] = vetor2[0].toUpperCase();
				if (vetor2[0].equals("C")) {
			for (int i = 0; i < vetor.length; i++) {
				for (int j = i + 1; j < vetor.length; j++) {
					if (vetor[j] < vetor[i]) {
						int aux = vetor[i];
						vetor[i] = vetor[j];
						vetor[j] = aux;
					}
				}
			}
			for (int i = 0; i < vetor.length; i++) {
				System.out.println("O valor do " + (i + 1) + "º número é: " + vetor[i]);
			} 
			break;
		} else if (vetor2[0].equals("D")) {
			for (int i = 0; i < vetor.length; i++) {
				for (int j = i+1; j < vetor.length; j++) {
					if (vetor[j] > vetor[i]) {
						int aux = vetor[i];
						vetor[i] = vetor[j];
						vetor[j] = aux;
					}
				}
			}
			for (int i = 0; i < vetor.length; i++) {
				System.out.println("O valor do "+(i+1)+"º número é: "+vetor[i]);
			} 
			break;
		} else if (vetor2[0].equals("S")){
			System.out.println("Você optou por encerrar a aplicação.");
		} else {
			System.out.println("Opção inváida, tente novamente.");
		}
		} while (!vetor2[0].equals("S"));
	}
}
