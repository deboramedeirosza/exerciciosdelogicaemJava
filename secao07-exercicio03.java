/*
 * Elabore um programa que gera e escreve os números ímpares dos números entre 100 e 200.
 */

package br.com.debora.secao07;

public class Exercicio03 {

	public static void main(String[] args) {
		//processamento
		for(int i = 100; i <= 200; i++) {
			if(i % 2 == 1) {
				System.out.println(i);
			}
		}

	}

}
