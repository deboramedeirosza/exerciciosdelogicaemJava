/*
*Ler uma variável numérica ne imprimi-la somente se a mesma for maior que 100, caso contrário imprmi-la com valor 0.
*/
package br.com.debora.secao06;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		//variáveis
		int n;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		System.out.print("Informe um número: ");
		n = teclado.nextInt();
		
		//processamento
		if(n > 100) {
			System.out.println(n);
		}else {
			n = 0;
			System.out.println(n);
		}
		teclado.close();
	}

}
