/*
 * Faça um programa que carregue um vetor de dez números inteiros. Calcule e mostre os números superiores a 50 e suas respectivas posições.
 * Mostrar mensagem se não existir nenhum número nesta condição.
 */
package br.com.debora.secao08;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		//variáveis
		int [] vetor = new int[10];
		boolean maior50 = false;
		Scanner teclado = new Scanner(System.in);
		
		//processamento
		for(int i = 0; i < 10; i++) {
			System.out.printf("Informe valor do vetor %d/10: ", (i+1));
			vetor[i] = teclado.nextInt();
		}
		for(int i = 0; i < 10; i++) {
			if(vetor[i] > 50) {
				System.out.printf("O número %d está na posiçao %d.", vetor[i], i);
				maior50 = true;
			}			
		}
		if(!maior50) {
			System.out.println("Não há número maior que 50.");
		}
		teclado.close();		
	}
}
