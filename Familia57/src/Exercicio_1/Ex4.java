package Exercicio_1;

import java.util.Scanner;

public class Ex4 {
	/*4- Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. 
Se for par exiba também a raiz quadrada do mesmo; 
se forímpar exiba o número elevado ao quadrado.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		
		double num;
		System.out.println("Digite um numero: ");
		num = ler.nextDouble();
		
		if (num %2==0) {
			System.out.printf("O número %.2f é par!!",num);
			double raiz = Math.sqrt(num);//raiz do numero par
			System.out.printf("\nA raiz quadrade de %.2f é de: %.2f", num,raiz);
		}
		else {
			System.out.printf("O número %.2f é par!!",num);
			double poncia = Math.pow(num,2);//potencia de 2 do numero impar
			System.out.printf("\nA raiz quadrade de %.2f é de: %.2f", num,poncia);
		}
		

	}

}
