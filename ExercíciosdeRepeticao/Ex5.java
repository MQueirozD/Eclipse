package ExercíciosdeRepeticao;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int numero,soma=0;
		
		do {
			System.out.println("Digite um número: ");
			numero = ler.nextInt();
			soma += numero;			
		}
		while(numero !=0);
		System.out.printf("\nA soma dos número é: %d",soma);
	}

}
