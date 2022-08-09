package ExercíciosdeRepeticao;
import java.util.Scanner;

public class Ex3 {
	/* 3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
	 * Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE) */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int idade,pessoaMaior=0,pessoaMenor=0,pessoa;
		System.out.println("Qual a sua idade: ");
		idade = ler.nextInt();
		while(idade>-99) {
			if (idade <21) {
				pessoaMenor ++;
			}
			else if(idade>50) {
				pessoaMaior ++;
			}
			System.out.println("Qual a sua idade: \n-99 Para sair");
			idade = ler.nextInt();
		}
		System.out.printf("Quantidade de pessoas menores que 21 anos é de : %d "
				+ "\nEquantidade de pessoas maior de 50 ano é de: %d",pessoaMenor,pessoaMaior);
	}

}
