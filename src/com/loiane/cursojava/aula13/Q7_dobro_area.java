package com.loiane.cursojava.aula13;
import java.util.Scanner;
import java.util.Locale;
public class Q7_dobro_area {
	public static void main(String[] args) {
		/*
		 Faça um programa que calcule a area de um quadrado em seguida 
		 mostre o dobro da área para o usuario
		 */
		
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("Digite o lado de um quadrado: ");
		double lado = scan.nextDouble();
		
		double area = Math.pow(lado, 2);
		
		double dobro_area = area * 2;
		
		System.out.println("\nO lado é: " + lado + "\nA ara é: " + area + "\nO dobro da área é: "+ dobro_area);
		
	}
}
