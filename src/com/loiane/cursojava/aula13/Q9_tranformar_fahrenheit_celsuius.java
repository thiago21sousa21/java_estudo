package com.loiane.cursojava.aula13;
import java.util.Scanner;
public class Q9_tranformar_fahrenheit_celsuius {
/*
 * faça um programa que leia a temperatura em graus fahrenheit,
 * transforme e mostre em graus celsius
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em fahreiheit: ");
		double tempFah = scan.nextDouble();
		
		double tempCelsius = 5 * (tempFah - 32)/9;
		
		System.out.println("A temperatura em graus Celsius é: " + tempCelsius);
	}
}
