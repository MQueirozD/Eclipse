package Menu;

import java.util.Scanner;

import Ex1.Cliente;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
							
		/*int nCliente;
		String nome,rua,produto;
		int telefone,idade,numRua,cep;*/		
		//System.out.println("\nDigite seu nome: ");
		
		Cliente cliente = new Cliente(1,"Mateus de Queiroz Davidson", "Engenheiro Caitano Alvares","Drone","(11)4002-8922",25,55,123456789);
				         //(int nCliente, String nome, String rua, String produto, String telefone, int idade, int numRua,int cep);
		
		cliente.imprimir();
		

	}

}
