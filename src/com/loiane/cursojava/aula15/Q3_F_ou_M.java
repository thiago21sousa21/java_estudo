package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Q3_F_ou_M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra F para femininino e M para Masculino: ");
		
		String letra = scan.next();
		
		if (letra.equalsIgnoreCase("M")) {
			System.out.println("Voce diditou masculino");
		} else if (letra.equalsIgnoreCase("F")) {
			System.out.println("Voce diditou feminino");
		}else {
			System.out.println("Sexo inválido");
		}
	}

}
