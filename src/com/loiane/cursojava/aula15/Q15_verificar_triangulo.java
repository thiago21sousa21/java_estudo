package com.loiane.cursojava.aula15;

import java.util.Locale;
import java.util.Scanner;

public class Q15_verificar_triangulo {

	public static void main(String[] args) {
		// Fazer um programa que recebe 3 lados e verifica se forma um triangulo
		// se for triangulo informar se é isoscele, equilatero ou escaleno
		
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
		if (a > b+c || b > a + c || c > a + b) {
			System.out.print("Não forma um triangulo!");
		} else {
			if ( a == b && a == c) {
				System.out.print("Forma um triangulo Equilátero");
			} else if(a == b || a == c || c == b) {
				System.out.print("Forma um triangulo isósceles");
			} else {
				System.out.print("Forma um triangulo escaleno");
			}
		}
	}

}
