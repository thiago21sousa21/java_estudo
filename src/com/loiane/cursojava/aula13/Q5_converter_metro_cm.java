package com.loiane.cursojava.aula13;
import java.util.Scanner;
import java.util.Locale;

public class Q5_converter_metro_cm {
	public static void main(String[] args) {
		/*Faça um programa que converta metro para centimetros*/
		
		Scanner scn = new Scanner(System.in);
		scn.useLocale(Locale.US);
		
		System.out.print("Digite um valor em metros: ");
		double metros = scn.nextDouble();
		double centimetros = metros * 100;
		System.out.print("Convertido para centimetros fica: " + centimetros);
	}

}
