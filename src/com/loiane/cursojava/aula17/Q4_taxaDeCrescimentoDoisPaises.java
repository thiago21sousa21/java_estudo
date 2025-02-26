package com.loiane.cursojava.aula17;

public class Q4_taxaDeCrescimentoDoisPaises {

	public static void main(String[] args) {
		// em quanto tempo o pais  A ultrapassa o pais B
		// se a tem 80000 habitantes com taxa anual de crescimento de 3%
		// o pais B tem 200000 habitantes com taxa de crescimento de 1.5%
		
		double paisA = 80000;
		double paisB = 200000;
		int cont = 0;
		while  (paisA <= paisB) {
			paisA = paisA * 1.03;
			paisB = paisB * 1.015;
			cont++;
		}
		System.out.println("O pais A vai ultrapassar o pais B em :" + cont + " anos");
	}

}
