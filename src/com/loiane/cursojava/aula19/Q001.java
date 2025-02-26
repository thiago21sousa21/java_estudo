package com.loiane.cursojava.aula19;
import java.util.Scanner;
import java.util.Locale;

public class Q001 {

	public static void main(String[] args) {
/*criar vetor A com 5 elementos e criar vetor B com o mesmo tipo, tamanho 
 * e elementos que A*/
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[5];
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = scan.nextInt();
		}
		
		int cont = 0;
		for (int elemento: vetorA) {
			vetorB[cont] = elemento;	
			cont++;
		}
		for (int elemento: vetorB) {
			System.out.print(elemento);	
		}
	}

}
