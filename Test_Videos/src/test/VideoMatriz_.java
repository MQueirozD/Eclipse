package test;

import java.util.Scanner;

public class VideoMatriz_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int[][] matriz = new int [3][3];
		System.out.println("Matriz M[3][3]\n");
		
		for (int linha=0;linha<3;linha++) {
			for (int coluna=0;coluna<3;coluna++) {
				System.out.printf("\nInsira um número de M: [linha%d][coluna%d]", linha+1,coluna+1);
				matriz[linha][coluna]=ler.nextInt();
			}
		}
		System.out.println("\nA matriz é: \n");
		for (int linha=0;linha<3;linha++) {
			for (int coluna=0;coluna<3;coluna++) {
				//System.out.println("\nA matriz é:\n");
				System.out.printf("\t %d \t", matriz[linha][coluna]);// o \t é como se fosse um TAB
			}
		}

	}

}
