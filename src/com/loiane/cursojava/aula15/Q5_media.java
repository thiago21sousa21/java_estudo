package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Q5_media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 faça um programa que leia duas notas, calcule a média e apresente:
 - aprovado se média maior ou igual7
 - reprovado se média menor que 7
 - aprovado com distinção se média igual 10
 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double n1 = scan.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double n2 = scan.nextDouble();
		
		double media = (n1 + n2)/2;
		
		if (media == 10) {
			System.out.println("Aprovado com distinção!");
		} else if (media >= 7) {
			System.out.println("Aprovado!");
		} else {
				System.out.println("Reprovado");
		}
	}

}
