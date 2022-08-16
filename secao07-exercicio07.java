/*
 * Sua organização acaba de contratar um estagiário para trabalhar no suporte de informática, com a intenção de fazer levantamento nas sucatas encontradas
nesta área. A primeira tarefa dele é testar todos os cerca de 200 mouses que se encontram lá, testanto e anotando o estado de cada um deles, para verificar
o que se pode aproveitar deles. Foi requisitado que você desenvolva um programa para registrar este levantamento. O programa deverá receber um número inde-
terminado de entradas, cada um contendo: um número de identificação do mouse e o tipo de defeito:
1 - necessita esfera;
2 - necessita limpeza;
3 - necessita troca do cabo ou conector;
4 - quebrado ou inutilizado.

Uma identificação igual a zero encerra o programa. Ao final o programa deverá emitir o seguinte relatório:

Quantidade de mouses: 100
Situação                                Quantidade      Percentual
- necessita esfera;                         40              40%
- necessita limpeza;                        30              30%
- necessita troca do cabo ou conector;      15              15%
- quebrado ou inutilizado.                  15              15%
 */

package br.com.debora.secao07;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		//variáveis
		int contador_total = 0, contador_sit1 = 0, contador_sit2 = 0, contador_sit3 = 0, contador_sit4 = 0, defeito, identificacao;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		System.out.print("Informe a identificação: ");
		identificacao = teclado.nextInt();
		
		//processamento
		while(identificacao != 0) {
			System.out.println("(1) Necessita Esfera");
			System.out.println("(2) Necessita Limpeza");
			System.out.println("(3) Necessita troca do cabo ou conector");
			System.out.println("(4) Quebrado ou inutilizado");
			System.out.print("Informe o número do defeito: ");
			defeito = teclado.nextInt();
			
			if(defeito == 1) {
				contador_sit1 = contador_sit1 + 1;
			}
			if(defeito == 2) {
				contador_sit2 = contador_sit2 + 1;
			}
			if(defeito == 3) {
				contador_sit3 = contador_sit3 + 1;
			}
			if(defeito == 4) {
				contador_sit4 = contador_sit4 + 1;
			}
			contador_total = contador_total + 1;
			
			System.out.print("Informe a identificação: ");
			identificacao = teclado.nextInt();
		}
		float p1, p2, p3, p4;
		p1 = ((float)contador_sit1 / (float)contador_total) * (float)100.00;
		p2 = ((float)contador_sit2 / (float)contador_total) * (float)100.00;
		p3 = ((float)contador_sit3 / (float)contador_total) * (float)100.00;
		p4 = ((float)contador_sit4 / (float)contador_total) * (float)100.00;
	

		System.out.printf("Quantidade de mouses: %d\n ", contador_total);
		System.out.println("\tSITUAÇÃO \t\t\tQUANTIDADES \t\tPERCENTUAL");
		System.out.printf("1 - Necessita esfera \t\t\t\t%d \t\t%.2f%%\n", contador_sit1, p1);
		System.out.printf("2 - Necessita limpeza \t\t\t\t%d \t\t%.2f%%\n", contador_sit2, p2);
		System.out.printf("3 - Necessita troca do cabo ou conector \t%d \t\t%.2f%%\n", contador_sit3, p3);
		System.out.printf("4 - Quebrado ou inutilizado \t\t\t%d \t\t%.2f%%\n", contador_sit4, p4);
		
		teclado.close();

	}

}
