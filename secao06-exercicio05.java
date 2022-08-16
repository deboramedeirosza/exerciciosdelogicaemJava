/* João da Silva, pescador, comprou um microcomputador para controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo
 * regulamento de pesca do estado de São Paulo (50kg), deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um algoritmo que leia variável 'p' (peso de
 * peixes) e verifique se há excessos. Se houver gravar na variável 'e' (excesso) e na variável 'm' o valor da multa que João deverá pagar. Caso contrário mostrar tais variáveis
 * com contéudo zero.
 
 */
package br.com.debora.secao06;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		//variáveis
		float p = 0, e = 0, m = 0;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.print("Informe o peso dos peixes: ");
		p = teclado.nextFloat();
		
		//processamento
		if(p > 50) {
			e = p - 50;
			m = e * 4;
			System.out.println("O peso de peixes é de " + p + "kg");
			System.out.println("O excesso de peixes é de " + e + "kg");
			System.out.printf("O valor da multa pelo excesso de peixe é de R$ %.2f", m);
		}else {
			System.out.println("O excesso de peixes é de " + e + "kg");
			System.out.printf("O valor da multa pelo excesso de peixe é de R$ %.2f", m);
		}
		teclado.close();
	}

}
