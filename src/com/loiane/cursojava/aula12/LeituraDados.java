package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDados {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*
		System.out.println("Digite seu nome completo: ");
		
		String nomeCompleto = scan.nextLine();
		
		System.out.println("Seu nome completo é: "  + nomeCompleto);
		*/

		System.out.println("Digite seu primeiro nome, idade, quantidade de filhos, altura e se tem bicho de estimação: ");
		
		String primeiroNome = scan.next();
		int idade  = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura = scan.nextFloat();
	    boolean temPet = scan.nextBoolean();
	    
	    System.out.println("você digitou os segintes valores: ");
	    System.out.println( primeiroNome);
	    System.out.println( idade);
	    System.out.println( qtdFilhos); 
	    System.out.println( altura);
	    System.out.println( temPet);

		
	}

}
