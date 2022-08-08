package test;

import java.util.Scanner;

public class lacos_condicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		int idade;
		String nome;
		
		System.out.println("Qual seu nome: ");
		nome = ler.next();
		System.out.println("Qual a sua idade: ");
		idade = ler.nextInt();
		
		System.out.printf("Seu nome é: %s" , nome);
		System.out.printf("\nSua idade é: %d" , idade);
		
		if (idade >=18) {
			System.out.println("\nVocê é maior de idade!!");
		}
		else {
			System.out.println("\nVocê ainda é menor de idade!!");
		}
		

	}

}
