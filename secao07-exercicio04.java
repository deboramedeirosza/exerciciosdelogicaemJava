/*
 * Construa um algoritmo que leia 10 valores inteiros e positivos e:
 * a) Encontre o maior valor;
 * b) Encontre o menor valor;
 * c) Calcule a média dos números lidos.
 */

package br.com.debora.secao07;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		//variáveis
		int numero, maior = -999, menor = 999, soma = 0;
		float media;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		for(int i = 0; i < 10; i++) {
			System.out.print("Informe um valor: ");
			numero = teclado.nextInt();
			
				if(numero > 0) {
					if(numero > maior) {
						maior = numero;
					}
					if(numero < menor) {
						menor = numero;
					}
					soma = soma + numero;
						
			}else {
				i--;//A função i-- tá sendo colocado p evitar o usuário informar números negativos. 
					//O i-- faz com se ignore o número negativo informado para q se tenha os 10 números positivos exigido no programa.
			}
		}
		media = soma /10;
		System.out.println("O maior número é " + maior);
		System.out.println("O menor número é " + menor);
		System.out.println("A média dos números é " + media);
		teclado.close();
	
	}
}
