package ExercicosExtras_ProgramacaoSequencial;

import java.util.Scanner;

public class Ex4 {
	/*4. Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão:  */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		double nA,nB,nC,R,S,D;
		System.out.println("\nQual o número de A: ");
		nA = ler.nextFloat();
		System.out.println("\nQual o número de B: ");
		nB = ler.nextFloat();
		System.out.println("\nQual o número de C: ");
		nC = ler.nextFloat();
		R =Math.pow((nA + nB), 2);
		System.out.println("\nR é: "+ R);
		S =Math.pow((nB + nC), 2);
		System.out.println("\nS é: "+ S);
		D = (R+S)/2;
		System.out.println("\nD é: "+ D);

	}

}
