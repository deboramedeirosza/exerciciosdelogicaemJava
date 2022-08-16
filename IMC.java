/*
*Calculadora de índice de massa corpórea.
*/
package br.com.debora.secao06;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		//variáveis
		float altura, peso, IMC = 0, qalt = 0;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.print("Informe a altura: ");
		altura = teclado.nextFloat();
		
		System.out.print("Informe o peso: ");
		peso = teclado.nextFloat();
		
		//processamento
		qalt = altura * altura;
		IMC = peso / qalt;
		
		if(IMC < 18.5) {
			System.out.println("Abaixo do peso");
		}else if(IMC > 18.5 && IMC < 24.9) {
			System.out.println("Peso normal");
		}else if(IMC > 25 && IMC < 29.9) {
			System.out.println("Sobrepeso");
		}else if(IMC > 30 && IMC < 34.9) {
			System.out.println("Obesidade grau I");
		}else if(IMC >35 && IMC < 39.9) {
			System.out.println("Obesidade grau II (severa");
		}else if(IMC > 40) {
			System.out.println("Obesidade móbida");
		}
		
		teclado.close();

	}

}
