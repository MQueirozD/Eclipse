package test;

import java.util.Iterator;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		
		int [][]numeros = new int[3][2];
		float meidaNumerosImpar;
		int somaNImpar=0,contaNImpar=0,linha,coluna;
		
		for (linha=0;linha<3;linha++){
			for (coluna=0;coluna<2;coluna++) {
				System.out.println("\nInforme um número: ");
				numeros[linha][coluna] = ler.nextInt();
				if (numeros[linha][coluna] %2 == 1) {
					somaNImpar += numeros[linha][coluna];
					contaNImpar++;
				}
			}
		}
		meidaNumerosImpar = somaNImpar / contaNImpar;
		System.out.printf("\nA quantidade de n impares: %d",contaNImpar);
		System.out.printf("\nA soma de n impares: %d",somaNImpar);
		System.out.printf("\nA média dos numeros impares são: %.2f",meidaNumerosImpar);
	}

}
