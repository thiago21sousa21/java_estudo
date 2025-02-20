package com.loiane.cursojava.aula15;
import java.util.Scanner;
public class Q10_imprimir_saudacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*programa que espera M-matutino V-vespertino N-noturno
 * e imprime bom dia, boa tarde ou boa noite segundo a entrada
 * ou imprime inválido para nenhum caso
 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite m v ou n para um turno: ");
		
		String letra = scan.next();
		
		if (letra.equalsIgnoreCase("m")) {
			System.out.println("Bom dia");
		} else if (letra.equalsIgnoreCase("v")) {
			System.out.println("Boa tarde");
		} else if (letra.equalsIgnoreCase("n")) {
			System.out.println("Boa noite");
		} else {
			System.out.println("Opção inválida!");
		}
	}

}
