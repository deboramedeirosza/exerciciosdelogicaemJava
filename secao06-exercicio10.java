/*
 * Elabora um algoritmo que dada a idade de um nadador classifique-o em uma das seguintes categorias:
 * infantil-a = 5 a 7 anos;
 * infantil-b = 8 a 11 anos;
 * juvenil-a = 12 a 13 anos;
 * juvenil-b = 14 a 17 anos;
 * adultos = maiores de 18 anos;
 */
package br.com.debora.secao06;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		//variável
		int idade;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		System.out.print("Informe a idade: ");
		idade = teclado.nextInt();
		
		//processamento
		if(idade < 5) {
			System.out.println("Não possui idade mínima.");
		}else if(idade >= 5 && idade <= 7){
			System.out.println("Infantil A");
		}else if(idade >= 8 && idade <= 11) {
			System.out.println("Infantil B");
		}else if(idade >= 12 && idade <= 13) {
			System.out.println("Juvenil A");
		}else if(idade >= 14 && idade <= 17) {
			System.out.println("Juvenil B");
		}else if(idade > 18) {
			System.out.println("Adultos");
		}
		teclado.close();

	}

}
