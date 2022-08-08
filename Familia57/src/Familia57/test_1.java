package Familia57;

import java.util.Scanner;

public class test_1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = "Mateus";
		int idade = 25,op;
		double altura=1.80, n1,n2,n3,media;
		
		Scanner ler = new Scanner (System.in);
		
			System.out.println("\nDados do(a): " + nome);
			System.out.println("\nIdade: " + idade + " anos");
			System.out.println("\nAltura: "+ altura + " m");
			
			System.out.print("\nQual a sua n1: ");
			n1 = ler.nextDouble();
			System.out.println("\nQual a sua n2: ");
			n2 = ler.nextDouble();
			System.out.println("\nQual a sua n3: ");
			n3 = ler.nextDouble();
			
			media = (n1+n2+n3)/3;
			System.out.println("\nSua média é: " + media);
			System.out.printf("\nSua média é %.2f: " + media);
			//System.out.printf("\nSua média é: %.2f" , media);
			
			if (media >= 7 && media<=10) {
				System.out.printf("Sua nota foi: %.2f", media + "Parabens!! você foi aprovado!!");
			}
			else if (media < 7 && media>=4) {
				System.out.printf("\nSua nota foi: %.2f",media+"CUIDADO!! você ficou de exame!!");
			}
			else {
				System.out.printf("\nSua nota foi: %.2f" , media+" "+ nome+"Foi reprovado!!");
			}
			
			
			System.out.println("\nOpções de filmes:");
			System.out.println("\n1 - A procura da felicidade");
			System.out.println("n2 - Os vigadores");
			System.out.println("\n3 - Prenda-me se for capaz");
			System.out.println("\n4 - Ilha do medo");
			System.out.println("Digite qual o filme deseja: ");
			op = ler.nextInt();
			
			switch (op) {
			case 1: {
				System.out.println("\nPronto para assistir: A procura da felicidade");
				break;
			}
			case 2: {
				System.out.println("\nPronto para assistir: Os vigadores");
				break;
			}
			case 3: {
				System.out.println("\nPronto para assistir: Prenda-me se for capaz");
				break;
			}
			case 4: {
				System.out.println("\nPronto para assistir:Ilha do medo");
				break;
			}
			
			default:				
				System.out.println("OPÇÃO INVALIDA " );
			}
			

	}

}
