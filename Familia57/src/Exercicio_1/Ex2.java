package Exercicio_1;

import java.util.Scanner;
/*2- Faça um programa que entre com três números e coloque em ordem crescente.*/

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		
		int n1,n2,n3,soma,crescente;
		System.out.println("\nDigite um número: ");
		n1 = ler.nextInt();
		System.out.println("\nDigite um número: ");
		n2 = ler.nextInt();
		System.out.println("\nDigite um número: ");
		n3 = ler.nextInt();
		soma = n1+n2+n3;
		
		if(n1<n2&&n1<n3) {
			if(n2<n3) {
				System.out.printf("A ordem crescente é:%d, %d, %d" ,n1,n2,n3);	
			}
			else if(n3<n2)
				System.out.printf("A ordem crescente é: %d, %d, %d",n1,n3,n2);			
		}
		
		else if(n2<n1&&n2<n3) {			
			if(n1<n3) {
				System.out.printf("A ordem crescente é: %d, %d, %d",n2,n1,n3);	
			}
			else if(n3<n1)
				System.out.printf("A ordem crescente é:%d, %d, %d",n2,n3,n1);			
		}
		
		else if(n3<n1&&n3<n2) {
			if(n2<n1) {
				System.out.printf("A ordem crescente é : %d , %d ,%d",n3,n2,n1);	
			}
			else if(n1<n2)
				System.out.printf("A ordem crescente é : %d , %d ,%d",n3,n1,n2);			
		}

	}
}
