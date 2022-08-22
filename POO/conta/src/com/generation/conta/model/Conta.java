package com.generation.conta.model;

public abstract class Conta {
	private int numero;
	private String agencia;
	private int tipo;
	private String titular;
	private float saldo;
	//private boolean sacar;
		
	public Conta(int numero, String agencia, int tipo, String titular, float saldo) {		
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public Conta() {//polimorfismo de SOBRECARGA (qnd esta na mesma classe)
		//metodo Conta vazio sem nada nele
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public void sacar(float valor) {
		if (this.getSaldo() < valor)
			System.out.println("\n Saldo Insuficiente!");

		this.setSaldo(this.getSaldo() - valor);
	}
	
	//public void ñ retorna valor so altera
	public void imprimir() {//aqui é um polimorfismo SOBREESCRITA(pq esta em classes diferentes tipo no CONTACORRENTE e CONTAINSS)
		
		String tipo = " ";
		switch(this.tipo) {
		case 1:
			tipo = "Conta Corrente";  //AQUI PEGA O NÚMERO E TRANSFORMA EM 
			break;                    //1 CONTA CORRENT E 2 CONTA INSS
		case 2:
			tipo = "Conta INSS";
			break;
		}
		//chama todos os this e fizemos como se fosse um menu
		System.out.println("\n-----------------------------------------");
		System.out.println("\n\tDados da conta");
		System.out.println("\n----------------------------------------");
		System.out.println("\nNúmeor da conta: " + this.numero);
		System.out.println("\nNúmero da agencia: " + this.agencia);
		System.out.println("\nTipo da conta: " + tipo);
		System.out.println("\nNome do titular: "+ this.titular);
		System.out.println("\nSaldo: " + this.saldo);
		//System.out.println("\nSacar: "+ this.sacar(saldo));
		System.out.println("\n----------------------------------------");
	}

	public void depositar(float valor) {
		
	}
	
	
	
	
	
	

}
