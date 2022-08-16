/* Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
 (72.7 * altura) -58
*/
 
package br.com.debora.secao03;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		//variáveis
		float altura, peso_ideal;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		System.out.print("Informe a altura: ");
		altura = teclado.nextFloat();
		
		//processamento
		peso_ideal = (float)(72.7 * altura) - 58; //cast: coloca-se (float) para o java entender que todos os dados da linha é tipo float. Sem (float) o java lê 72.7 como tipo double.
		
		//saída
		System.out.printf("O peso ideal é %.2f", peso_ideal);//impressão com a mesma formatação da linguagem C para que o resultado apresente 2 casas decimais após a vírgula.
		
		teclado.close();
	}

}
