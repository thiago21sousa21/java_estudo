package com.loiane.cursojava.aula13;
import java.util.Scanner;

public class Q8_ganho_por_hora {
	public static void main(String[] args) {
		/*Faça um programa que pergunte o seu ganho por hora
		 * e no final calcule o seu ganho em um mês
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora? ");
		
		double ganhoPorHora = entrada.nextDouble();
		
		double valorNoMes = ganhoPorHora * 8 * 22;
		
		System.out.print("Voce ganha no mes: "+ valorNoMes);
	}
}
