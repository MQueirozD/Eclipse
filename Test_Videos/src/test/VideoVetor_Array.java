package test;

import java.util.Scanner;

public class VideoVetor_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int [] arrayUm = {12, 3, 5, 68, 9, 6, 73, 44, 456, 65, 321};
		int [] arrayDois = {43, 42, 4, 8, 55, 21, 2, 45};
		
		float[] nota= new float[5];//TAMANHO O ARRAY
		
		if(arrayDois.length>8) {//length conta o tammanho do array
			System.out.println("\nTamanho do ArrayDois - maior que 8");
		}
		else {
			System.out.println("\nTamanho do ArrayDois - menor que 8");
		}
		System.out.printf("\nTamanha do ArrayUm é: %d",arrayUm.length);
		//USANDO DO FOR-EACH
		String[] cars = {"\nVolvo", " ", "Ford"," ","Mercedes"};
		for(String i : cars) {
			System.out.println(i);
		}
		//POPULANDO UM ARRAY
		for (int x=0;x<5;x++) {
			System.out.println("\nDigite uma nota: ");
			nota[x] = ler.nextFloat();			
		}
		for (int x=0;x<5;x++) {			
			System.out.printf("\nNota: %d = %.2f",(x+1),nota[x]);				
		}


	}

}
