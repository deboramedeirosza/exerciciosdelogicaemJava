/*
 * Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrando mensagem de erro e 
 * voltando a pedir as informações.
 */

package br.com.debora.secao07;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		//variáveis
		String nome, senha;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		System.out.print("Informe um nome: ");
		nome = teclado.next();// .next() é usado para receber a informação da string.
		System.out.print("Informe uma senha: ");
		senha = teclado.next();
		
		//processamento
		while(nome.equals(senha)) { // No Java para se comparar as strings se usa 'yyy.equals(xxx)'
			System.out.println("Erro: O nome e senha tem que ser diferentes.");
			
			System.out.print("Informe um nome: ");
			nome = teclado.next();
			System.out.print("Informe uma senha: ");
			senha = teclado.next();
		
		teclado.close();
		}

	}

}
