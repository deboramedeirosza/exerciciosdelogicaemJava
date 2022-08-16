// Faça um algoritmo que converta metros para centímetros.

package br.com.debora.secao03;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		//variáveis
		int metros, centimetros;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		System.out.print("Informe o valor em metros: ");
		metros = teclado.nextInt();
		
		//processamento
		centimetros = (metros * 100);
		
		//saída
		
		System.out.println(metros + " metros em centímetros é " + centimetros);
		
		
		teclado.close();		

	}

}
