package Lista3;

import java.util.Scanner;

public class e5 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String p1 = "", p2 = "", op = "";
		double[] taxaC = new double[2];
		int ano;
		double[] populacao = new double[2];
		double verificacao;
		double verificacao2;
		double[] teste = new double[2];
		while (!op.equals("sair")) {
			System.out.println("Escolha qual o comando desejado: " + "\n" + "1 - Carregar os dados do primeiro país"
					+ "\n" + "2 - Carregar os dados do segundo país" + "\n" + "3 - Editar dados" + "\n"
					+ "4 - Ver resultado" + "\n" + "sair - sair");
			op = ler.next();
			op = op.toLowerCase();
			switch (op) {
			case ("1"):
					System.out.println("Qual o nome do 1º país?");
					p1 = ler.next();
				do {
					System.out.println("Qual a população de " + p1);
					populacao[0] = ler.nextInt();
				} while (populacao[0] < 0);
				do {
					System.out.println("Qual a taxa de crescimento anual de " + p1);
					taxaC[0] = ler.nextFloat();
				} while (taxaC[0] < 0);
				break;

			case ("2"):
				do {
					System.out.println("Qual o nome do 2º país?");
					p2 = ler.next();
				} while (p2.equals(p1));
				do {
					System.out.println("Qual a população de " + p2);
					populacao[1] = ler.nextInt();
				} while (populacao[1] < 0);
				do {
					System.out.println("Qual a taxa de crescimento anual de " + p2);
					taxaC[1] = ler.nextFloat();
				} while (taxaC[1] < 0);
				break;

			case ("3"):
				op = "";
				do {
					System.out.println("Escolha qual dado deseja editar:" + "\n" + "1 - " + p1 + "\n" + "2 - " + p2
							+ "\n" + "sair - sair");
					op = ler.next();
					op = op.toLowerCase();
					if (op.equals("1")) {
						op = "";
						while (!op.equals("sair")) {
							System.out.println("O que deseja alterar?" + "\n" + "1 - Populacao" + "\n"
									+ "2 - Taxa de Crescimento");
							op = ler.next();
							if (op.equals("1")) {
								do {
									verificacao = (int) populacao[0];
									System.out.println("Escreva um novo valor para a população de " + p1);
									populacao[0] = ler.nextInt();
									if (populacao[0] < 0 && populacao[0] == verificacao) {
										System.out.println(
												"Número inválido, por favor insira um número maior ou igual a 0 e diferente do valor antigo.");
									}
								} while (populacao[0] < 0 && populacao[0] == verificacao);
								break;
							} else if (op.equals("2")) {
								do {
									verificacao2 = taxaC[0];
									System.out.println("Escreva um novo valor para a taxa de crescimento de " + p1);
									taxaC[0] = ler.nextFloat();
									if (taxaC[0] < 0 && taxaC[0] == verificacao2) {
										System.out.println(
												"Favor insira um número maior ou igual a 0 e diferente do anterior.");
									}
								} while (taxaC[0] < 0 && taxaC[0] == verificacao2);
								break;
							} else if (op.equals("sair")) {
								System.out.println("Você optou por sair desse menu!");
							} else {
								System.out.println("Opção inválida, tente novamente!");
							}
						}
					} else if (op.equals("2")) {
						op = "";
						while (!op.equals("sair")) {
							System.out.println("O que deseja alterar?" + "\n" + "1 - Populacao" + "\n"
									+ "2 - Taxa de Crescimento");
							op = ler.next();
							op = op.toLowerCase();
							if (op.equals("1")) {
								do {
									verificacao = (int) populacao[1];
									System.out.println("Escreva um novo valor para a população de " + p2);
									populacao[1] = ler.nextInt();
									if (populacao[1] < 0 && populacao[1] == verificacao) {
										System.out.println(
												"Número inválido, por favor insira um número maior ou igual a 0 e diferente do valor antigo.");
									}
								} while (populacao[1] < 0 && populacao[1] == verificacao);
								break;
							} else if (op.equals("2")) {
								do {
									verificacao2 = taxaC[1];
									System.out.println("Escreva um novo valor para a taxa de crescimento de " + p2);
									taxaC[1] = ler.nextFloat();
									if (taxaC[1] < 0 || taxaC[1] == verificacao2) {
										System.out.println(
												"Favor insira um número maior ou igual a 0 e diferente do anterior.");
									}
								} while (taxaC[1] < 0 || taxaC[1] == verificacao2);
								break;
							} else if (op.equals("sair")) {
								System.out.println("Você optou por sair desse menu!");
							} else {
								System.out.println("Opção inválida, tente novamente!");
							}
						}
					} else if (op.equals("sair")) {
						System.out.println("Você optou por siar desse menu.");
					} else {
						System.out.println("Opção inválida, tente novamente!");
					}
				} while (!op.equals("1") && !op.equals("2") && !op.equals("sair"));
				break;

			case ("4"):
				ano = 0;
			    teste[0] =  (taxaC[0]*populacao[0]);
			    teste[1] =  (taxaC[1]*populacao[1]);
			    if (teste[1] > teste[0]) {
			    	System.out.println("A população de "+p1+" nunca passará a de "+p2);
			    	System.out.println("Sugiro alterar os dados de um dos países.");
			    } else {
			    	taxaC[0] = taxaC[0]/100;
                	taxaC[1] = taxaC[1]/100;
               while (populacao[0] <= populacao[1]){
                	populacao[0] =  (populacao[0]+taxaC[0]*populacao[0]);
                	populacao[1] =  (populacao[1]+taxaC[1]*populacao[1]);
                	ano++;
                }
                System.out.println("Levará "+ano+" anos para o país "+p1+" passar a população de "+p2);
                }
			    break;
			}
		}
	}
}
