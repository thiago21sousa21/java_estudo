package com.loiane.cursojava.aula15;
import java.util.Scanner;

public class Q1_comparar_dois_numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o primeiro número: ");
		double n1 = scan.nextDouble();
		System.out.println("Entre com o segundo número: ");
		double n2 = scan.nextDouble();
		
		System.out.print("O maior número é: ");
		
		if (n1 > n2) {
			System.out.println(n1);
		} else {
			System.out.println(n2);
		}
	}

}
