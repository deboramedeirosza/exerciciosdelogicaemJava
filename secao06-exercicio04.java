/* Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo que calcule o peso ideal, utilizando as seguintes fórmulas:
 Para homem: (72.7 * altura) - 58
 Para mulher: (62.1 * altura) - 44.7 
*/
package br.com.debora.secao06;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		//variáveis
		float altura, peso_ideal;
		char sexo;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.print("Informe a altura: ");
		altura = teclado.nextFloat();
		
		System.out.print("Informe o sexo m/f: ");
		sexo = teclado.next().charAt(0); //No Java não tem algo do tipo "nextChar()" assim como tem pra int ou float. A função "charAt(0)" pega a primeira letra da string digitada. 
		
		//processamento
		if(Character.toLowerCase(sexo) == 'm') {    //Character.toLowerCase(sexo) para converter um char para minúsculo.
			peso_ideal = (float)(72.7 * altura) - 58; //cast
			System.out.printf("O peso ideal é %.2f", peso_ideal);
		}else if(Character.toLowerCase(sexo) == 'f') {
			peso_ideal = (float)(62.1 * altura) - (float)44.7;
			System.out.printf("O peso ideal é %.2f", peso_ideal);
		}else if(sexo != 'm' && sexo != 'f') {
			System.out.println("Sexo não reconhecido.");
			peso_ideal = 0;	
		}
		teclado.close();

	}

}
