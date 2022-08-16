/*Faça um algoritmo que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
Calcule e mostre o total do seu salário no referido mês.*/

package br.com.debora.secao03;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		//variáveis
		float valor_hora, salario;
		int horas_trabalhadas;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.print("Informe o valor da hora trabalhada: ");
		valor_hora = teclado.nextFloat();
		
		System.out.print("Informe quantas horas foram trabalhadas no mês: ");
		horas_trabalhadas = teclado.nextInt();
						
		//processamento
		salario = horas_trabalhadas * valor_hora;
		
		//saída
		System.out.println("O salário total deste mês é R$ " + salario);
		
		teclado.close();

	}

}
