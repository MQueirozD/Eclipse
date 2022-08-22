package ExerciosCollections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

/*3- Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:*/

public class Loja {
	public static void main(String[] args) {
					
		
		ArrayList<String> produtos = new ArrayList<String>();
		
		
		//Armazenar dados da List 
		produtos.add("Camiseta");//0
		produtos.add("Camisa");//1
		produtos.add("Tenis");//2
		produtos.add("Meias");//3
		produtos.add("Calças");//4
		produtos.add("Bermudas");//6
		produtos.add("Chapeu");//7
				
		System.out.println(produtos.toString());
		
		// Remover dados da list;
		produtos.remove(6);
		
		// Atualizar dados da list.
		System.out.println("\nProduto 7 removido: \n"+produtos);
		
		// Apresentar todos os dados da list.
		produtos.set(5, "Shorts");
		System.out.println("\nProduto 6 atualizado: \n"+produtos);		
		
		
	}
}
