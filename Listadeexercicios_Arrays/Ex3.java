package Listadeexercicios_Arrays;

import java.util.Scanner;

public class Ex3 {
	/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		
		int[][] matriz = new int [3][3];
		int maior=0;
		
		for(int linha=0;linha<3;linha++) {
			for(int coluna=0;coluna<3;coluna++) {
				System.out.println("\nDigite um número: ");
				matriz[linha][coluna] = ler.nextInt();
				if(matriz[linha][coluna] >10) {
					maior ++;
				}
			}
		}
		for(int linha=0;linha<3;linha++) {
			for(int coluna=0;coluna<3;coluna++) {
				System.out.printf("\nO número da linha %d | da coluna %d | é %d",linha+1,coluna+1,matriz[linha][coluna]);												
			}
		}
		System.out.printf("\nA quantidade de números maiores que 10 foi: %d",maior);
	}

}
