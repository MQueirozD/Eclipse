package ExercíciosdeRepeticao;

import java.util.Scanner;

public class Ex6 {
	/*6- Escrever um programa que receba vários números inteiros no teclado.
  	E nofinal imprimir a média dos números múltiplos de 3.  
	Para sair digitar 0(zero).(DO...WHILE)*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int num,multiplos=0,media=0,quantidade=0;
		System.out.println("Digite uma número: ");
		num = ler.nextInt();
		do {
			System.out.println("Digite outro número: \n0 para sair");
			num = ler.nextInt();
			if (num%3==0) {
				multiplos +=num;
				quantidade ++;
				media = multiplos/ quantidade;
				}
			
		}
		while(num !=0);
		System.out.println("A média números de ");
	}

}
