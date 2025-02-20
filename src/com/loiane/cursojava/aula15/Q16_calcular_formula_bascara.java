package com.loiane.cursojava.aula15;

import java.util.Locale;
import java.util.Scanner;

public class Q16_calcular_formula_bascara {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		//System.out.println("");
		System.out.println("Este programa recebe as tres raizes de uma equação de segundo grau ax² + bx + c e retorna suas raizes reais");
		System.out.println("Entre com o coeficiente  a: ");
		double a = scan.nextDouble();
		System.out.println("Entre com o coeficiente  b: ");
		double b = scan.nextDouble();
		System.out.println("Entre com o coeficiente  c: ");
		double c = scan.nextDouble();
		
		if (a== 0) {
			System.out.println("Não é uma equação de segundo grau!");
		} else {
			double delta = Math.pow(b, 2) - 4 * a * c;
			if ( delta < 0) {
				System.out.println("Esta equação não tem raízes reais, pois delta é negativo!");
			} else if (delta == 0) {
				double x = b*(-1)/(2*a);
				System.out.print("A equação só tem uma raiz real pois delta é igual a 0\n");
				System.out.println("A raiz da equação é: " + x);
			} else {
				double x1 = (-b + Math.sqrt(delta))/(2*a);
				double x2 = (-b - Math.sqrt(delta))/(2*a);
				
				System.out.println("A equação possui delta positivo e portanto tem duas raízes: ");
				System.out.println("x1: "+ x1);
				System.out.println("x2: "+ x2);
			}
		}
	}

}
