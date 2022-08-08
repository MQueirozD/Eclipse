package Exercicio_1;
import java.util.Scanner;

public class Ex1 {
	/*1- Faça um programa que receba três inteiros e diga qual deles é o maior. */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,n3,soma;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("\nDigite um número: ");
		n1 = ler.nextInt();
		System.out.println("\nDigite um número: ");
		n2 = ler.nextInt();
		System.out.println("\nDigite um número: ");
		n3 = ler.nextInt();
		soma = n1+n2+n3;
		
		if (n1 > n2 && n1>n3){
			System.out.printf("%d é o maior númeor" , n1);
		}
		else if(n2>n1 && n2>n3) {
			System.out.printf("%d é o maior númeor" , n2);
		}
		else {
			System.out.printf("%d é o maior númeor" , n3);
		}
		
		System.out.println("\nA soma de todos os números é: " + soma);

	}

}
