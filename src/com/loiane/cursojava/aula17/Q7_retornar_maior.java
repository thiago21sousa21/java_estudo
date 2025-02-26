package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Q7_retornar_maior {
	public static void main(String[] args) {
		/*
		 faça um programa que leia cinco números e mostre o maior deles
		 */
		Scanner scan = new Scanner(System.in);
		double maior = Double.MIN_VALUE;
		for(int i = 0; i < 5 ; i++) {
			if (i==0) {
				System.out.println("Entre com o "+ (i+1) + "° numero");
				maior = scan.nextDouble();
			} else {
				System.out.println("Entre com o "+ (i+1) + "° numero");
				double atual = scan.nextDouble();
				if (atual > maior) {
					maior = atual;
				}
			}
		}
		System.out.println("o maior número é: "+ maior);
	}
}
