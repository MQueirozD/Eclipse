package com.generation.conta.model;

import java.util.ArrayList;

import com.generation.conta.repository.ContaRepository;

public class Banco implements ContaRepository {
	
	private ArrayList<Conta> listConta = new ArrayList<Conta>();
	
	
	
	public Banco() {
		this.listConta = new ArrayList<Conta>();
	}

	@Override
	public void inserir(Conta conta) {
		// TODO Auto-generated method stub
		listConta.add(conta);//vai adicionado varias contas
		System.out.println("\nConta número: "+ conta.getNumero() + " foi criada com sucesso!!");
		
	}

	@Override
	public int procurar(int numero) {
		// TODO Auto-generated method stub
		for (int contador=0; contador<listConta.size();contador++) {
			if (listConta.get(contador).getNumero() == numero) {
				return contador;
			}
		}
		return -1;
	}

	@Override
	public void visualizar(int posicao) {
		// TODO Auto-generated method stub
		if (posicao != 1) {
			listConta.get(posicao).imprimir();
		}
		else {
			System.out.println("\nConta não encontrada!!");
		}
		
	}

	@Override
	public void sacar(int posicao, float valor) {
		// TODO Auto-generated method stub
		if (posicao != 1) {
			listConta.get(posicao).sacar(valor);;
		}
		else {
			System.out.println("\nConta não encontrada!!");
		}		
	}	
	
	public int gerarNumero () {
		return listConta.size() + 1;//mostra o tamanho da lista e add mais 1
	}
	
	public void verSaldo(int posicao) {
		if (posicao != 1) {
			System.out.println("\nO Saldo da conta número: " + listConta.get(posicao).getNumero()//esta pegando a posicao e o numero
					+ " R$ " +  listConta.get(posicao).getSaldo());//esta pegando a posicao e o salda e mostra
			listConta.get(posicao).imprimir();
		}
	}
	public void depositar(int posicao, float valor) {
		if (posicao != 1) {
			if (listConta.get(posicao).getTipo() == 1) {
				listConta.get(posicao).depositar(valor);
			}
			else {
				System.out.println("\nOperação invalida!!");
			}
		}
		else {
			System.out.println("\nConta não encontrada!!");
		}		
	}
	
	public void transferir (int posicaoOrigem, int posicaoDestino, float valor) {
		if(posicaoOrigem != -1 && posicaoDestino != -1) {
			if (listConta.get(posicaoOrigem).getTipo() == 1 && listConta.get(posicaoDestino).getTipo()==1) {
				listConta.get(posicaoOrigem).sacar(valor);
				listConta.get(posicaoDestino).depositar(valor);
				System.out.println("\nTransferencia afetuada com sucesso!!");
			}
			else {
				System.out.println("\nOperação invalida!!");
			}
		}
			else {
				System.out.println("\nOperação não encontrada!!");
			}
		
	}
	

}
