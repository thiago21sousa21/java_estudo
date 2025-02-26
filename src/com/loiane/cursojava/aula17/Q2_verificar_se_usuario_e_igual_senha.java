package com.loiane.cursojava.aula17;
import java.util.Locale;
import java.util.Scanner;

public class Q2_verificar_se_usuario_e_igual_senha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		boolean loginInvalido = true;
		do {
			System.out.println("Entre com o usuario: ");
			String usuario = scan.next();
			System.out.println("Entre com a senha: ");
			String senha = scan.next();
			if (usuario.equalsIgnoreCase(senha)) {
				System.out.println("O nome de usuario não pode ser igual a senha: ");
			} else {
				System.out.println("Login efetuado com sucesso!!");
				loginInvalido = false;
			}
		}while(loginInvalido);
	}

}
