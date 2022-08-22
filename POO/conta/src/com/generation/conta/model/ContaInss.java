package com.generation.conta.model;

public class ContaInss extends Conta{
	
	private int beneficio;

	public ContaInss(int numero, String agencia, int tipo, String titular, float saldo, int beneficio) {
		super(numero, agencia, tipo, titular, saldo);//TRAZ TD Q ESTA EM CONTA
		this.beneficio = beneficio;
	}

	public int getBeneficio() {
		return beneficio;
	}

	public void setBeneficio(int beneficio) {
		this.beneficio = beneficio;
	}
	
	public void imprimir() {
			super.imprimir();
			System.out.println("Número do beneficio: "+ this.beneficio);
	}

}
