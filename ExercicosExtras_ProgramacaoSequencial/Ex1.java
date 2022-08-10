package ExercicosExtras_ProgramacaoSequencial;

import java.util.Scanner;

public class Ex1 {
	/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int dia,anos,meses,soma;
		System.out.println("\nQue dia você nasceu: ");
		dia = ler.nextInt();
		System.out.println("\nQual mês: ");
		meses = ler.nextInt();
		System.out.println("\nQual a sua idade: ");
		anos = ler.nextInt();
		
		soma = ((anos * 365)+(meses* 30)+dia );
		System.out.printf("\nSua idade em dias é: %d  dias",soma);
		

	}

}
