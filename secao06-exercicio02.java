//Elabor um algoritmo que leia um número. Se positivo armazeneo-o em 'a', se negativo, em 'b'. No final mostrar resultado.
package br.com.debora.secao06;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		//variáveis
		int numero, a, b;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		System.out.print("Informe um número: ");
		numero = teclado.nextInt();
		
		//processamento
		if(numero > 0) {
			a = numero;
			System.out.println(a + " é um número é positivo.");
		}else {
			b = numero;
			System.out.println(b + " é um número é negativo.");
		}
		teclado.close();
	}

}
