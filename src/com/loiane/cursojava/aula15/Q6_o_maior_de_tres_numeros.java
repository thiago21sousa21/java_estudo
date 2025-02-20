package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Q6_o_maior_de_tres_numeros {

	public static void main(String[] args) {
		// faça um programa que leia tres numero se mostre o maior deles
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite tres numeros que te mostrarei o maior: ");
		
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		double n3 = scan.nextDouble();
		
		double maior = n1;
		
		if (n2 > maior) {
			maior = n2;
		} else if (n3 > maior) {
			maior = n3;
		}
		
		System.out.println("O maior número é o: "+ maior);
	}

}
