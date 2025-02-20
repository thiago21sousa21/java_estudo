package com.loiane.cursojava.aula15;

import java.util.Locale;
import java.util.Scanner;

public class Q17_ano_bissexto {

	public static void main(String[] args) {
		// faça um programa para determinar se um ano é bissexto
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("Digite o ano a ser verificado: ");
		int ano = scan.nextInt();
		
		//anos multiplos de quatro que não sejam por 100 exceto se for por 400
		
		if (ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0) {
			System.out.println("bissexto");
		} else {
			System.out.println("não é bissexto");
		}
	}

}
