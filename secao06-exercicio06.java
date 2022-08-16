/* Elabore um algoritmo que leia  as variáveis 'c' e 'n', respectivamente código e número de horas trabalhadas de um operário. Calcule o salário sabendo-se que ele ganha R$ 10,00
 * por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável 'e'. Caso contrário zerar tal variável. A hora excedente de trabalho
 * vale R$ 20,00. No final do processamento imprimir o salário total e salário excedente.
  */

package br.com.debora.secao06;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		//variáveis
		int c;
		float n, e = 0, salario = 0, valor_hora = (float) 10.00;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		System.out.print("Informe o código do operário: ");
		c = teclado.nextInt();
		System.out.print("Informe a quantidade de horas trabalhadas: ");
		n = teclado.nextFloat();
		
		//processamento
		if(n > 50) {
			e = (float)(n - 50) * (float)20.00;
			salario = (50 * valor_hora) + e;
			System.out.printf("O salário total é de R$ %.2f\n", salario);
			System.out.printf("O salário excedente é de R$ %.2f\n", e);
		}else {
			salario = n * valor_hora;
			System.out.printf("O salário total é de R$ %.2f\n", salario);
			System.out.printf("O salário excedente é de R$ %.2f\n", e);
		}
		teclado.close();
	}

}
