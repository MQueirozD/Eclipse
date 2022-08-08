package test;

import java.util.Scanner;

public class entrada_saida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner (System.in);
		int a,b,soma;
		System.out.print("\nDigite número de A: ");
		a= ler.nextInt();
		System.out.print("\nDigite número de B: ");
		b= ler.nextInt();
		soma = a+b;
		System.out.println("\nA soma de A + B é de: "+ soma);
		System.out.println("\nO calculo foi: "+ a+ " + " + b +" = "+ soma);
		
				

	}

}
