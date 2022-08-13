package Lista3;

import java.util.Scanner;

public class e2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String usuario, senha;
		System.out.println("Digite seu usuário: ");
		usuario = ler.next();
		do {
			System.out.println("Digite sua senha: ");
			senha = ler.next();
			if (senha.equals(usuario)) {
				System.out.println("Favor digite uma senha diferente do nome de usuário");
			} else {
				break;
			}
		} while (usuario.equals(usuario));
		System.out.println("Registro efetuado com sucesso!");
	}
}
