package com.generation.conta;

import java.util.Scanner;

import com.generation.conta.model.Conta;

public class Menu {
	Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Importa o METODO Conta(tem q esta com o memso nome com letra maiuscula se tiver)
		Conta c1 = new Conta(123,"123","CC","João Queiroz", 200.2f);
		            // Conta(int numero, String agencia, String tipo, String titular, float saldo)
		c1.imprimir();//pega o imprimir do metodo Conta
		Conta c2 = new Conta(133,"133","CC","Amanda Queiroz", 200000.2f);
		c2.imprimir();
		
		System.out.println("\nCliente: "+ c1.getTitular());
		System.out.println("\nO saldo da conta é: " + c1.getSaldo());//pega do dado
		c1.setSaldo(1000);//altera o dado
		System.out.println("\nSeu saldo da conta é: " + c1.getSaldo());
		System.out.println("Caro: "+ c2.getTitular());
		System.out.println("\nO saldo da conta é: " + c1.getSaldo());//pega do dado
		c2.setTipo("Amanda Giacometti");
		System.out.println("\nSeu nome foi atualizado: " + c2.getTitular());
		
		Conta c3 = new Conta();
		c3.imprimir();
		System.out.println("\nDigite seu nome: ");
		
		c3.imprimir();
		
		
		 

	}

}
