package ExercíciosdeRepeticao;

import java.util.Scanner;

public class Ex4 {
/* 4- Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. 
 * Para tanto, a cada uma das pessoas era perguntado: 
 * idade, sexo (1-feminino / 2-masculino / 3-Outros), 
 * e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos. */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int idade,sexoF=0,sexoM=0,outros =0,op=0,opCalmo,pessoaCalma=0,pessoaNervosa=0,pessoaAgrassiva=0,pessoas=0;
		int hAgressivo=0,mNervosas=0,oCalmos=0,pNervosasM=0,pCalmasMenor=0;
		//System.out.println("Qual a sua idade: ");
		//idade = ler.nextInt();
		
		while(op !=4) {
			System.out.println("\nSelecione seu sexo:\n1- Feminino\n2- Masculino \n3- Outros \n4- Sair");
			op = ler.nextInt();
			pessoas ++;
			if(op == 1) {
				sexoF ++;
				System.out.println("\nSelecione o como você se está:"
						+ "\n1- Uma pessoa era calma\n2- Uma pessoa era nervosa \n3- Uma pessoa era agressiva \n4- Sair");
				opCalmo = ler.nextInt();
				if (opCalmo == 1) {
					pessoaCalma ++;
				}
				else if (opCalmo == 2) {
					pessoaNervosa ++;
					mNervosas ++;
				}
				else if(opCalmo == 3) {
					pessoaAgrassiva ++;
				}
				System.out.println("\nQual a sua idade: ");
				idade = ler.nextInt();
				if (idade >40 && opCalmo ==2) {
					pNervosasM ++;
				}
				else if(idade <18 && opCalmo ==1) {
					pCalmasMenor ++;
				}
			}
			
			if(op == 2) {
				sexoM ++;
				System.out.println("\nSelecione o como você se está:"
						+ "\n1- Uma pessoa era calma\n2- Uma pessoa era nervosa \n3- Uma pessoa era agressiva \n4- Sair");
				opCalmo = ler.nextInt();
				if (opCalmo == 1) {
					pessoaCalma ++;
				}
				else if (opCalmo == 2) {
					pessoaNervosa ++;
				}
				else if(opCalmo == 3) {
					pessoaAgrassiva ++;
					hAgressivo ++;
				}
				System.out.println("\nQual a sua idade: ");
				idade = ler.nextInt();
				if (idade >40 && opCalmo ==2) {
					pNervosasM ++;
				}
				else if(idade <18 && opCalmo ==1) {
					pCalmasMenor ++;
				}				
			}
			if(op == 3) {
				outros ++;
				System.out.println("\nSelecione o como você se está:"
						+ "\n1- Uma pessoa era calma\n2- Uma pessoa era nervosa \n3- Uma pessoa era agressiva \n4- Sair");
				opCalmo = ler.nextInt();
				if (opCalmo == 1) {
					pessoaCalma ++;
					oCalmos ++;
				}
				else if (opCalmo == 2) {
					pessoaNervosa ++;
				}
				else if(opCalmo == 3) {
					pessoaAgrassiva ++;
				}
				System.out.println("\nQual a sua idade: ");
				idade = ler.nextInt();
				if (idade >40 && opCalmo ==2) {
					pNervosasM ++;
				}
				else if(idade <18 && opCalmo ==1) {
					pCalmasMenor ++;
				}				
			}		
				
	}
		System.out.println("\nFINALIZOU!!");
		System.out.printf("\nO número de pessoas calmas: %d",pessoaCalma);
		System.out.printf("\nO número de mulheres nervosas: %d",mNervosas);
		System.out.printf("\nO número de homens agressivos: %d",hAgressivo);
		System.out.printf("\nO número de outros calmos: %d",oCalmos);
		System.out.printf("\nO número de pessoas nervosas com mais de 40 anos: %d",pNervosasM);
		System.out.printf("\nO número de pessoas calmas com menos de 18 anos.: %d",pCalmasMenor);		
	}	

}


