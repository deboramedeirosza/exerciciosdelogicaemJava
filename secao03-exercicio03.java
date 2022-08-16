/* Ler um número e verificar se ele é par ou impar. Quando for par armazenar esse valor em 'p', e quando for ímpar armazená-lo em 'i'.
 * Exibir 'p' e 'i' no final do processamento.
  */
package br.com.debora.secao06;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		//variáveis
		int numero, p, i;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		System.out.print("Informe um número: ");
		numero = teclado.nextInt();
		
		//processamento
		if(numero % 2 == 0){
			p = numero;
			System.out.println(p);
		}else{
			i = numero;
			System.out.println(i);
		}
		teclado.close();

	}

}
