/*
 * Escreva um alggoritmo que leia dois vetores de 10 posições e faça soma dos elementos do mesmo índice, colocando o resultado em um terceiro vetor.
 * Mostre o vetor resultante.
 */

package br.com.debora.secao08;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		//variáveis
		int[] vetor1 = new int[10];
		int[] vetor2 = new int[10];
		int[] soma = new int[10];
		Scanner teclado = new Scanner(System.in);
		
		//processamento
		for(int i = 0; i < 10; i++) {
			System.out.print("Informe o valor do vetor 1: ");
			vetor1[i] = teclado.nextInt();
			System.out.print("Informe o valor do vetor 2: ");
			vetor2[i] = teclado.nextInt();
			soma[i] = vetor1[i] + vetor2[i];
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(soma[i]);
		}
		teclado.close();

	}

}
