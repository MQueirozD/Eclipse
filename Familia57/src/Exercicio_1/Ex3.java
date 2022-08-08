package Exercicio_1;

import java.util.Scanner;

public class Ex3 {
	/*3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		
		int idade;
		System.out.println("Digite sua idade: ");
		idade = ler.nextInt();
		if (idade>=10&&idade<=14) {
			System.out.printf("Sua idade é: %d \nSeu publico é 10-14 infantil!!",idade);
		}
		else if(idade>=15&&idade<=17) {
			System.out.printf("Sua idade é: %d \nSeu publico é 15-17 juvenil!!",idade);
		}
		else if(idade>=18&&idade<=25) {
			System.out.printf("Sua idade é: %d \nSeu publico é 18-25 adulto!!",idade);
		}

	}

}
