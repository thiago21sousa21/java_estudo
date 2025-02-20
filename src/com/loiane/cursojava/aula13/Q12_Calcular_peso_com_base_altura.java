package com.loiane.cursojava.aula13;
import java.util.Locale;
import java.util.Scanner;

public class Q12_Calcular_peso_com_base_altura {

	public static void main(String[] args) {
/*
 * Tendo altura como base calcule o peso ideal de uma pessoa com a formula
 * (72.7* altura)-58;
 */
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.print("Digite a altura para que eu calcule o peso ideal: ");
		double altura = scan.nextDouble();
		
		double pesoIdeal = (altura * 72.7) - 58;
		
		System.out.println("O peso ideal é: "+ pesoIdeal);
	}

}
