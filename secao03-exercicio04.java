// Faça um algoritmo que peça dois números e imprima a soma.

package br.com.debora.secao03;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		//variáveis
		int num1, num2, soma;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.print("Informe o primeiro número: ");
		num1 = teclado.nextInt();
		
		System.out.print("Informe o segundo número: ");
		num2 = teclado.nextInt();
				
		//processamento
		soma = num1 + num2;
		
		//saída
		System.out.println("A soma dos números é: " + soma);
		
		teclado.close();
	}

}
