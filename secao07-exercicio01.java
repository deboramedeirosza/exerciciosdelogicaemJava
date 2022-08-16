/*
Faça um número algoritmo que determine o maior entre N números. A condição de parada é a entrada de um valor 0, ou seja, o algoritmo
deve ficar calculando o maior até que a entreda seja igual a 0 (zero).
 */

package br.com.debora.secao07;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		//variáveis
		int numero, maior = 0;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		System.out.print("Informe um número: ");
		numero = teclado.nextInt();
		
		//processamento
		while(numero != 0) {
			if(numero > maior) {
				maior = numero;
			}
			System.out.print("Informe um número: ");
			numero = teclado.nextInt();
			
		}System.out.println("O maior valor é " + maior);
		teclado.close();	
	}

}
