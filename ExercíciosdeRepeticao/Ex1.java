package ExercíciosdeRepeticao;

import java.util.Scanner;

public class Ex1 {
	/*1- Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int numero;
		
		for (numero = 1000;numero<=1999;numero++) {
			if (numero%11==5) {
				System.out.println(numero);
				//System.out.printf("\n %d ",numero);
			}
			
		}

	}

}
