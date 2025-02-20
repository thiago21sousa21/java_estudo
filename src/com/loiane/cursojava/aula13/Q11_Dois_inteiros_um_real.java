package com.loiane.cursojava.aula13;

import java.util.Locale;
import java.util.Scanner;

public class Q11_Dois_inteiros_um_real {

	public static void main(String[] args) {
/*
 * faça um programa que leia dois numero inteiro e um real
 * e mostre:
 * 	o produto do dobro do primeiro com metade do segundo:
 * 	a soma do triplo do primeiro com o terceiro
 * 	o terceiro elevado ao cubo
 **/
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("Digite dois número inteiro e um número real: ");
		int inteiro1 = scan.nextInt();
		int inteiro2 = scan.nextInt();
		double real = scan.nextDouble();
		
		double produtoDobro1Meio2 = (inteiro1 * 2 ) * (inteiro2 * 1/2);
		double somaTriplo1Tereceiro = (inteiro1 * 3 ) + real;
		double cuboTerceiro = Math.pow(real, 3);
		
		
		System.out.println("o produto do dobro do primeiro com metade do segundo: " + produtoDobro1Meio2);
		System.out.println("a soma do triplo do primeiro com o terceiro: " + somaTriplo1Tereceiro);
		System.out.println("Terceiro elevado ao cubo: " + cuboTerceiro);
		
	}

}
