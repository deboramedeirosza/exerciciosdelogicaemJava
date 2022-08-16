/*
 * A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de insdústrias que são altamente poluentes ao meio ambiente. O índice de poluição aceitável varia de
 * 0,05 até 0,25. Se o índice sobre para 0,3 as indústrias do 1º grupo são intimadas para suspenderem as atividades, se o índice crescer para 0,4 as indústrias do 1º e 2º grupo são
 * intimadas para suspenderem as atividades, se o índice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades. 
 * Faça um algoritmo que leia o índice de poluição medido e emita a notificação adequada aos diferentes grupos de empresas.
 */

package br.com.debora.secao06;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		//variável
		float indice;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		System.out.print("Informe o índice de poluição: ");
		indice = teclado.nextFloat();
		
		//processamento
		if(indice >= 0.3 && indice < 0.4) {
			System.out.println("Indústrias do 1º grupo devem suspender as atividades.");
		}else if(indice >= 0.4 && indice < 0.5) {
			System.out.println("Indústrias do 1º e 2º grupo devem suspender as atividades.");
		}else if(indice >= 0.5) {
			System.out.println("Indústrais de todos os grupos devem suspender as atividades.");
		}else {
			System.out.println("Níveis aceitáveis. Continuem as atividades.");
		}
		teclado.close();
	
	}

}
