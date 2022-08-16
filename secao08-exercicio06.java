/*
 * Faça um programa que receba um código numérico inteiro e um vetor de cinco posições de números reais. Se o código for zero, termine o programa.
 * Se o código for 1, mostre o vetor na ordem direta. Se o código for 2 , mostre o vetor na ordem inversa.
 */

package br.com.debora.secao08;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		//variáveis
		float [] vetor = new float[5];
		int codigo;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		System.out.print("Informe o código: ");
		codigo = teclado.nextInt();
		
		//processamento
		if(codigo != 0 && codigo <= 2) {
			for (int i = 0; i < 5; i++) {
				System.out.print("Informe um número real: ");
				vetor[i] = teclado.nextFloat();
			}
			if(codigo == 1) {
				for(int i = 0; i < 5; i++) {
					System.out.println(vetor[i]);
				}
			}if(codigo == 2) {
				for(int i = (vetor.length - 1); i >= 0; i--) {
					System.out.println(vetor[i]);
				}
			}
		}
		teclado.close();
	}

}
