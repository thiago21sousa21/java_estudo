package com.loiane.cursojava.aula13;
import java.util.Scanner;
public class Q10_LerCelsiusTransformarFahrenheit {
/*
 * faça um programa que lê uma temperatura em graus celsius e tranforma para fahrenheit
*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual a temperatura em Celsius? ");
		
		double tempCelsius = scan.nextDouble();
		
		double tempFahrenheit = tempCelsius * 9/5 + 32;
		
		System.out.println("A temperatura " + tempCelsius + " graus Celsius equivale a " + tempFahrenheit + "graus fahrenheit");
	}
}
