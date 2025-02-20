package com.loiane.cursojava.aula15;

import java.util.Locale;
import java.util.Scanner;

public class Q11_aumento_de_salario {

	public static void main(String[] args) {
		// fazer um programa que recebe um sálario de um colaborador faz, reajustes
		// e mostra os reajustes
		
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("Digite o salario do colaborador: ");
		double salario = scan.nextDouble();
		
		double aliquota = 0;
		double valorAjuste = 0;
		double novoSalario = 0;
		
		if (salario <= 280) {
			aliquota = 20.0/100;
			valorAjuste = salario * aliquota;
			novoSalario = salario + valorAjuste;
		} else if (salario > 280 && salario <= 700) {
			aliquota = 15.0/100;
			valorAjuste = salario * aliquota;
			novoSalario = salario + valorAjuste;
		} else if (salario > 700 && salario <= 1500) {
			aliquota = 10.0/100;
			valorAjuste = salario * aliquota;
			novoSalario = salario + valorAjuste;
		} else if (salario > 1500) {
			aliquota = 5.0/100;
			valorAjuste = salario * aliquota;
			novoSalario = salario + valorAjuste;
		}
		
		System.out.println("O salario antigo era de: " + salario);
		System.out.println("O percentual do ajuste foi de: " + aliquota);
		System.out.println("O valor do ajuste no salario foi de: "+ valorAjuste);
		System.out.println("O valor do novo salário ficou de: "+ novoSalario);
	}

}
