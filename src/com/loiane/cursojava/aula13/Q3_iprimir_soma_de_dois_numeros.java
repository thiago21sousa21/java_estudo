package com.loiane.cursojava.aula13;
import java.util.Scanner;
public class Q3_iprimir_soma_de_dois_numeros {
/*Faça um programa que peça dois números e então imprima a soma deles*/
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite dois númeos: ");
		
		int n1 = entrada.nextInt();
		int n2 = entrada.nextInt();
		
		int soma = n1 + n2;
		
		System.out.print("A soma dos número é: " + soma);
		
		
		
	}

}
