/*
 * Faça um programa que carregue um vetor com 10 números inteiros.
 * Mostre o vetor na ordem inversa a que foi digitado.
 */
package br.com.debora.secao08;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		//variáveis
		int[] vetor = new int[10];
		Scanner teclado = new Scanner(System.in);
		
		//processamento
		for(int i = 0; i < 10; i++) {
			System.out.print("Digite um valor: ");
			vetor[i] = teclado.nextInt();
		}
		for(int i = (vetor.length -1); i >= 0; i--) { // 'vetor.length - 1' faz com q identifique a quantidade de elementos no vetor e subtraia 1.
			System.out.println(vetor[i]);
		}
		teclado.close();
	}

}
