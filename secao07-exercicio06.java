/*
 * Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual número
 * ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
 * 
 * Tabuada de 5:
 * 5 X 1 = 5
 * 5 X 2 = 10
  ...
 * 5 X 10 = 50
 */

package br.com.debora.secao07;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		//variáveis
		int numero, resultado;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		System.out.print("Informe um número: ");
		numero = teclado.nextInt();
		
		//processamento
		while(numero < 1 || numero > 10) {
			System.out.println("O número deve ser entre 1 e 10.");
			System.out.println("Informe um número: ");
			numero = teclado.nextInt();
		}
		System.out.println("Tabuada de " + numero);
		
		for(int i = 0; i <= 10; i++) {
			resultado = numero * i;
			System.out.println(numero + " X " + i + " = " + resultado);
		
		}
		teclado.close();
	}

}
