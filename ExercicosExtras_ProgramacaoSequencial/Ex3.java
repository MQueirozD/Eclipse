package ExercicosExtras_ProgramacaoSequencial;

import java.util.Scanner;

public class Ex3 {
	/*3. Faça um sistema que 
	 * leia o tempo de duração de um evento em uma fábrica expressa em segundos e 
	 * mostre-o expresso em horas, minutos e segundos. */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int h,m,sec,s;
		System.out.println("\nQual o tempo de duração em segundos: ");
		s = ler.nextInt();
		h =(s /3600);
		m =((s%3600)/60);
		sec= (((s%3600)/60)/60);
		
		System.out.printf("\nO tempo foide %dhs %dmin %ds",h,m,sec);
		

	}

}
