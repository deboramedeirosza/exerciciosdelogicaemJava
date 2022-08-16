/*
 * Faça um algoritmo que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar, e se é positivo ou negativo.
 */


package br.com.debora.secao06;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		//variáveis
		int numero;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		System.out.print("Informe um número: ");
		numero = teclado.nextInt();
		
		//processamento
		if(numero != 0) {
			if(numero % 2 == 0) {
				if(numero > 0) {
					System.out.printf("%d é um número par e positivo", numero);
				}else {
					System.out.printf("%d é um número par e negativo", numero);
				}
			}else {
				if(numero > 0) {
					System.out.printf("%d é um número impar e positivo", numero);
				}else {
					System.out.printf("%d é um número impar e negativo", numero);
				}
		}
		}else {
			System.out.println("0 (zero) é um número neutro e positivo");
		}
		teclado.close();

	}

}
