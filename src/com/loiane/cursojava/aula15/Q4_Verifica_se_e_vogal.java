package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Q4_Verifica_se_e_vogal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com uma letra: ");
		
		String letra = scan.next();
		
		if (letra.equalsIgnoreCase("a") || 
				letra.equalsIgnoreCase("e") || 
				letra.equalsIgnoreCase("i") || 
				letra.equalsIgnoreCase("o") || 
				letra.equalsIgnoreCase("a") || 
				letra.equalsIgnoreCase("u")) {
			System.out.println("E uma volgal");
		} else {
			System.out.println("Não é uma volgal");
		}
	}

}
