/*
 * Faça um algoritmo que carregue um vetor de 5 elementos inteiros e em seguida armazene em um vetor apenas os números pares maiores que 0.
 * No final deve mostrar os elementos do vetor na tela.
 */
package br.com.debora.secao08;

import java.util.ArrayList;

public class Exercicio01 {

	public static void main(String[] args) {
		//variáveis
		//não vai receber os dados do teclado pq vai gerar o vetor dinamicamente por meio de repetição.
		ArrayList<Integer> vetor = new ArrayList<Integer>();
		ArrayList<Integer> pares = new ArrayList<Integer>(); //'ArrayList' é um tipo de repetição do java chamado 'collection' 
		
		for(int i = 0; i < 5; i++) {
			vetor.add(i);//adicionando o valor de i no vetor. O '.add' adiciona o valor que tá passando para o vetor. 3
			if(i % 2 == 0) {
				if(i > 0) {
					pares.add(i);//adicionando valor de i no pares.
				}
			}
		}
		
		for(Integer n : pares){ //estrutura 'for' específica pra usar nesse tipo de 'collection'
								///esse 'for que dizer: 'pra cada elemento inteiro dentro do vetor de pares, colocar na variável 'n''.
			System.out.println(n);
		}

	}

}
