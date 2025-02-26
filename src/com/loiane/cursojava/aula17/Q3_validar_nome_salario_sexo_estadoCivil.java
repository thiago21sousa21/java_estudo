package com.loiane.cursojava.aula17;
import java.util.Scanner;
import java.util.Locale;

public class Q3_validar_nome_salario_sexo_estadoCivil {

	public static void main(String[] args) {
//		fazer programa que leia :
//			-nome tem no minimo 3 caracteres
//			-idade: entre 0 e 150
//			-salario: maior que zero
//			-sexo: m ou f
//			-estado civil: s, c, v, d
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		
		System.out.println("Digite o nome: ");
		String nome = scan.next();
		while(nome.length() < 3) {
			System.out.println(" O numero mínimo de caracteres é 3!");
			nome = scan.next();
		}
		
		System.out.println("Entre com a idade: ");
		int idade = scan.nextInt();
		while(idade < 0 || idade > 150) {
			System.out.println("Digite uma idade válida! (0 - 150)");
			idade = scan.nextInt();
		}
		
		System.out.println("Entre com o salário!");
		double salario = scan.nextDouble();
		while(salario < 0) {
			System.out.println("Tu ja viu salario negativo brother?");
			salario = scan.nextDouble();
		}

		System.out.println("Entre com o sexo: ");
		String sexo = scan.next();
		while (!(sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f"))) {
			System.out.println("O sexo tem que ser m ou f!!");
			sexo = scan.next();
		}
		
		System.out.println("Por fim entre com o estado civil (c, s, d, v): ");
		String estadoCivil = scan.next();
		String csdv = "csdv";
		while(!csdv.contains(estadoCivil)) {
			System.out.println("Entre apenas com c, s, d, ou v para seu estado civil: ");
			estadoCivil = scan.next();
		}
		
		System.out.println("Seu nome é: " + nome);
		System.out.println("Sua idade é: " + idade);
		System.out.println("Seu salario é: " + salario);
		System.out.println("Seu sexo é: " + sexo);
		System.out.println("Seu estado civil é: " + estadoCivil);
	}

}
