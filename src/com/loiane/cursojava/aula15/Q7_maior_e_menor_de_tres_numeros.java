package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Q7_maior_e_menor_de_tres_numeros {

	public static void main(String[] args) {
		// faça um programa que leia tres numero se mostre o maior deles
		// e o menor tambem
		
				Scanner scan = new Scanner(System.in);
				
				System.out.println("Digite tres numeros que te mostrarei o maior: ");
				
				double n1 = scan.nextDouble();
				double n2 = scan.nextDouble();
				double n3 = scan.nextDouble();
				
				double maior = n1;
				double menor = n1;
				double meio = n1;
				
				if (n2 > maior) {maior = n2;}
				if (n3 > maior) {maior = n3;}
				
				if (n2 < menor) {menor = n2;}  
				if (n3 < menor) {menor = n3;}
				
				if (meio > n2 ) { 
					if (n2 > n3) {
						meio = n2;
					} else {
						meio = n3;
					}
				} else if ( meio > n3) {
					if (n2 > n1) {
						meio = n2;
					}
				} else if( meio < n2 && meio < n3) {
					if (n2 > n3) {
						meio = n3;
					} else {
						meio =n2;
					}
				}
				
				System.out.println("O maior número é o: "+ maior);
				System.out.println("O menor número é o: "+ menor);
				System.out.println("O numero do meio é: "+ meio);
	}

}
