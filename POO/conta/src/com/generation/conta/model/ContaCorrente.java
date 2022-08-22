package com.generation.conta.model;

public class ContaCorrente extends Conta{
	private float limite;

	
	
	public ContaCorrente(int numero, String agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo);
		this.limite = limite;
	}
	

	public float getLimite() {
		return limite;
	}


	public void setLimite(float limite) {
		this.limite = limite;
	}

	@Override
	public void depositar(float valor) {
		// TODO Auto-generated method stub
			this.setSaldo(this.getSaldo()+ valor);	
	}	
	
	public void imprimir() {
		
		super.imprimir();//ele ta puxando a herança da classe Conta o .imprimir();
		System.out.println("\nO limite do seu limite é: "+ this.limite);
	}
	

}
