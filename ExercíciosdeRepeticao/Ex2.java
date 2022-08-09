package ExercíciosdeRepeticao;

import java.util.Iterator;
import java.util.Scanner;

public class Ex2 {
	/*2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);	
		int par=0,impar=0,num;
		
		for (int x=0;x<=10;x++){
			System.out.println("Digite um númemor: ");
			num = ler.nextInt();
			if(num%2==0) {
				par ++;
			}
			else {
				impar ++;
			}			
		}
		System.out.printf("Os números impares são: %d",impar);
		System.out.printf("\nOs números pares são: %d", par);
	}

}
