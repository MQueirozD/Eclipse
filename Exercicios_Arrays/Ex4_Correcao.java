package Exercicios_Arrays;

import java.util.Scanner;

public class Ex4_Correcao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		float [][] matriz1 = new float [2][2];
		float [][] matriz2 = new float [2][2];
		float [][] matriz3 = new float [2][2];
		int linha,coluna,num,op;
		
		for( linha=0;linha<2;linha++) {
			for( coluna=0;coluna<2;coluna++) {
				System.out.println("\nEntre com a matriz1: ");
				matriz1[linha][coluna] = ler.nextFloat();
				System.out.println("\nEntre com a matriz2: ");
				matriz2[linha][coluna] = ler.nextFloat();				
			}
		}
		do {
			System.out.println("\n\t\tMENU DE MATRIZ");
			System.out.println("\n1- Somar as duas matrizes");
			System.out.println("\n2- Subtrair a primeira matriz da segunda");
			System.out.println("\n3- Adicionar uma constante as duas matrizes");
			System.out.println("\n4- Imprimir as matrizes ");
			op = ler.nextInt();
			
			switch(op) {
			case 1:
				for( linha=0;linha<2;linha++) {
					for( coluna=0;coluna<2;coluna++) {
						matriz3[linha][coluna]= matriz1[linha][coluna]+matriz2[linha][coluna];
						System.out.println("\n1- Diferença é: " + matriz3[linha][coluna]);
					}
				}
				break;
			case 2:
				for( linha=0;linha<2;linha++) {
					for( coluna=0;coluna<2;coluna++) {
						matriz3[linha][coluna]= matriz2[linha][coluna] - matriz1[linha][coluna];
						System.out.println("\n2- Diferença é: " + matriz3[linha][coluna]);
					}
				}
				break;
			case 3:
				System.out.println("\nDigite um númeor: ");
				num = ler.nextInt();
				for( linha=0;linha<2;linha++) {
					for( coluna=0;coluna<2;coluna++) {
						matriz1[linha][coluna] += num;
						matriz2[linha][coluna] += num;
						System.out.println("\n3- Matriz 1 mais p numeo é: " + matriz1[linha][coluna]);
						System.out.println("\n3- Matriz 2 mais p numeo é: " + matriz2[linha][coluna]);
					}
				}
				break;
			case 4:
				for( linha=0;linha<2;linha++) {
					for( coluna=0;coluna<2;coluna++) {
						System.out.println("\n4- Matriz 1 é: " + matriz1[linha][coluna]);
						System.out.println("\n4- Matriz 2 é: " + matriz2[linha][coluna]);
					}
				}
				break;
			case 0:
				System.out.println("\nObrigado!!");
				break;
				default:
					System.out.println("OPÇÃO INVALIDA!!");				
			}	
		}while(op!=0);
	}
}
