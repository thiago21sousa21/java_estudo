package com.loiane.cursojava.aula17;

import java.util.Locale;
import java.util.Scanner;

public class Q1_notas_entre_0e10 {

	public static void main(String[] args) {
		// Faça um programa que leia uma nota entre zero e 10, se o usuario 
		// ficar digitando um valor inválido o programa tem que continuar inistisndo
		
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("Digite uma nota entre zero e 10: ");
		
		//double nota = scan.nextDouble();
		
		//primeira forma de fazer:
		
//		while(nota > 10 || nota < 0) {
//			System.out.print("Você precisa digitar uma nota entre 0 e 10!\n");
//			System.out.print("Tente de novo: ");
//			nota = scan.nextDouble();
//		}
		
		
		// segunda forma de fazer
		
//		boolean estaNoIntervalo = false;
//		
//		do {
//			if(nota > 10 || nota < 0) {
//				System.out.print("Você precisa digitar uma nota entre 0 e 10!\n");
//				System.out.print("Tente de novo: ");
// 				nota = scan.nextDouble();
//			}else {
//				estaNoIntervalo = true;
//			}
//			
//		} while(!estaNoIntervalo);
		
		
		// terceira forma de fazer
		
		while(true) {
			double nota = scan.nextDouble();
			boolean estaForaIntervalo = nota > 10 || nota < 0;
			if(!estaForaIntervalo) {
				System.out.print("Você digitou: " + nota);
				break;
			}
			System.out.print("Você precisa digitar uma nota entre 0 e 10!\n");
			System.out.print("Tente de novo: ");			
		}
		//System.out.print("Você digitou: " + nota);
	}

}
