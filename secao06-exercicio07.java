/*
 Desenvolva um algoritmo que:
 a) Leia 4 números;
 b) Calcule o quadrado de cada um;
 c) Se o valor resultante do quadrado do terceiro número for >= 100, imprima-o e finalize;
 d) Caso contrário, imprima os valores lidos e seus respectivos quadrados.
 */

package br.com.debora.secao06;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		//variáveis
		int n1, n2, n3, n4, q1, q2, q3, q4;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.print("Informe o número 1: ");
		n1 = teclado.nextInt();
		System.out.print("Informe o número 2: ");
		n2 = teclado.nextInt();
		System.out.print("Informe o número 3: ");
		n3 = teclado.nextInt();
		System.out.print("Informe o número 4: ");
		n4 = teclado.nextInt();
		
		//processamento
		q1 = n1 * n1;
		q2 = n2 * n2;
		q3 = n3 * n3;
		q4 = n4 * n4;
		
		if(q3 >= 100) {
			//saída
			System.out.print(q3);
		}else {
			//saídas
			System.out.printf("Número 1: %d; Quadrado: %d\n", n1, q1);
			System.out.printf("Número 2: %d; Quadrado: %d\n", n2, q2);
			System.out.printf("Número 3: %d; Quadrado: %d\n", n3, q3);
			System.out.printf("Número 4: %d; Quadrado: %d\n", n4, q4);
		}
		teclado.close();
		
	}

}
