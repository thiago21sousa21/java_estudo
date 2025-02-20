package com.loiane.cursojava.aula15;

import java.util.Locale;
import java.util.Scanner;

public class Q18_e_par {

	public static void main(String[] args) {
// receber um inteiro e determinar se é par ou impar
		
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("Digite um inteiro: ");
		int num = scan.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("E par");
		} else {
			System.out.println("E impar");
		}
	}

}
