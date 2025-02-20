package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Q13_Ganho_por_mes_com_descontos_impostos {

	public static void main(String[] args) {
/*
 * Faça um programa que leia o quanto voce ganha por hora, leia a quantidade de horas
 * trabalhadas no mes, calcule o seu salário no mês, calcule o valor que voce paga
 * de imposto de renda sabendo que a aliquota é de 11%, quanto voce paga de INSS 
 * sabendo que a alíquota é 8% e sindicato é 5%;
 * mostre o seu salario bruto, o valor de cada um dos impostos e o valor do salario 
 * líquido
 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora? ");		
		double ganhoPorHora = scan.nextDouble();
		
		System.out.print("Quantas horas voce trabalhou no mês: ");
		double horasTrabalhadas = scan.nextDouble();
		
		double salarioBruto = ganhoPorHora * horasTrabalhadas;
		double valorImpostoRenda = salarioBruto * (11.0 / 100);
		double valorImpostoInss = salarioBruto * (5.0 / 100);
		double valorImpostoSindicato = salarioBruto * (8.0 / 100);
		double salarioLiquido = salarioBruto - (valorImpostoInss + valorImpostoRenda
				 + valorImpostoSindicato);
		System.out.println("Salario bruto no mês: "+ salarioBruto);
		System.out.println("Valor imposto de renda: " + valorImpostoRenda);
		System.out.println("Valor imposto sindicato: "+ valorImpostoSindicato);
		System.out.println("Valor imposto INSS: "+ valorImpostoInss);
		System.out.println("Salario líquido: "+ salarioLiquido);
		
	}

}
