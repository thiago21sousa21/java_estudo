package com.loiane.cursojava.aula15;

import java.util.Locale;
import java.util.Scanner;

public class Q14_calcular_medias_exibir_conceito {

	public static void main(String[] args) {
		// Faça um programa que calcule a média de duas notas e exiba uma classificação
		// para ela A, B, C, D, E
		// Reprovado se for conceito D OU E e aprovado nos demais
		
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("Entre com a primeira nota: ");
		double nota1 = scan.nextDouble();
		System.out.println("Entre com a segunda nota: ");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2)/2;
		
		String aproveitamento;
		if (media >= 9) {
			aproveitamento = "A";
		} else if (media >= 7.5) {
			aproveitamento = "B";
		} else if (media >= 6) {
			aproveitamento = "C";
		} else if (media >= 4) {
			aproveitamento = "D";
		} else {
			aproveitamento = "E";
		}
		
		String passou;
		
		if (aproveitamento.equalsIgnoreCase("D") || aproveitamento.equalsIgnoreCase("E")) {
			passou = "REPROVADO";
		} else {
			passou = "APROVADO";
		}
		
		System.out.println("As notas foram: " + nota1 + ", "+ nota2);
		System.out.println("A média foi: "+ media);
		System.out.println("O conceito foi: "+ aproveitamento);
		System.out.println(" E o aluno foi " + passou);
	}

}
