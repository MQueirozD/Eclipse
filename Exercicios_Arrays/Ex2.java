package Exercicios_Arrays;
import java.util.Scanner;

public class Ex2 {
	/*2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		
		int [] num = new int[6];
		//int [] par = new int[6];
		//int [] impar = new int[6];
		int x,qunatPar =0,somaPar=0,quantImpar=0,numero,contaPar=0;
		
		for (x=0;x<6;x++) {	
			System.out.println("\nDigite um número: ");
			num[x] = ler.nextInt();			
		}
		
		for (x=0;x<6;x++) {	
			if(num[x]%2==0) {
				System.out.printf("\nOs números pares são: %d ",num[x]);
				contaPar ++;
				qunatPar ++;
				somaPar += num[x];
			}		
		}
		System.out.printf("\nA quantidade de números pares são: %d ",qunatPar);
		System.out.printf("\nA soma números pares são: %d ",somaPar);
		
		for (x=0;x<6;x++) {	
			if(num[x]%2==1) {
				System.out.printf("\nOs números impares são: %d ",num[x]);
				quantImpar ++;
			}		
		}	
		//int soma = num[0]+num[2];
				System.out.printf("\nA quantidade de números impares são: %d ",quantImpar);	
	}

}
