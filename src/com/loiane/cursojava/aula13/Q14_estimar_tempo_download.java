package com.loiane.cursojava.aula13;
import java.util.Scanner;
import java.util.Locale;

public class Q14_estimar_tempo_download {

	public static void main(String[] args) {
/*
 * Fazer programa que pedo o tamanho de um um arquivo em MB
 * Uma velocidade de download em Mpbs
 * Calcularo tempo aproximado de download em minutos
 */
		
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("Digite o tamanho de um arquivo em MB: ");
		double tamanhoArquivo = scan.nextDouble();
		
		System.out.println("Digite a velocidade de download em Mpbs: ");
		double velocidadeDownload = scan.nextDouble();
		
		double tempoEstimado = tamanhoArquivo /(velocidadeDownload * 60);
		
		System.out.println("O tempo estimado de download é de "+ tempoEstimado + " minutos");
	}

}
