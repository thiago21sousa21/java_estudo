package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Q2_verificar_se_numero_positivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("digite um número: ");
		
		double numero = scan.nextDouble();
		
		if (numero >= 0) {
			System.out.println("o número " + numero + " é positivo");
		} else {
			System.out.println("o número " + numero + " é negativo");
		}
	}

}
