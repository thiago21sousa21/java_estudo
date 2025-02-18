package com.loiane.cursojava.aula13;
import java.util.Scanner;
import java.util.Locale;

public class Q4_media {
//Faça um programa que peça as 4 notas bimestrais e mostre a média
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		scn.useLocale(Locale.US);
		
		System.out.println("Digite as quatro notas do bimestre: ");
		double n1 = scn.nextDouble();
		double n2 = scn.nextDouble();
		double n3 = scn.nextDouble();
		double n4 = scn.nextDouble();
		
		double media = (n1 + n2 + n3 + n4)/4;
		
		System.out.print("A média das quatro notas é: " + media);
	}

}
