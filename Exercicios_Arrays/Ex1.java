package Exercicios_Arrays;

import java.util.Scanner;

public class Ex1 {
/*1- Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		
		int [] num = {1,0,5,-2,-5,7};
		//int [] A = new int [6];
		int x,soma=0,atribuir = 0;
		
		
		soma = num[0]+num[1]+num[5];
		//System.out.printf("\nLinha:= %d",num[3]);
		System.out.printf("\nA soma das linhas 0, 1 e 5: %d",soma);
		System.out.println("\n(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.");
		atribuir = num[4] + 100;
		System.out.printf("\nO valor ficou de: %d",atribuir);
		System.out.println("\n(d) Mostre na tela cada valor do vetor A, um em cada linha");
		for (x=0;x<6;x++) {			
			System.out.printf("\nLinha: %d = %d",(x),num[x]);				
		}
		
		

	}

}
