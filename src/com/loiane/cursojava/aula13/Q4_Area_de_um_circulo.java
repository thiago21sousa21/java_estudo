package com.loiane.cursojava.aula13;
import java.util.Scanner;
import java.util.Locale;

public class Q4_Area_de_um_circulo {
	public static void main(String[] args) {
		/*Faça um programa que peça o raio de um círculo calcule e mostra a sua área*/
		Scanner scn = new Scanner(System.in);
		scn.useLocale(Locale.US);
		
		System.out.print("Digite o raio do círculo: ");
		
		double raio = scn.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.print("A area do círculo é: " + area);
	}
}
