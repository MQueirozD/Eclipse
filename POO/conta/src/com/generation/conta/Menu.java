package com.generation.conta;

import java.io.IOException;
import java.util.Scanner;

import com.generation.conta.model.Banco;
import com.generation.conta.model.Conta;
import com.generation.conta.model.ContaCorrente;
import com.generation.conta.model.ContaInss;
import com.generation.conta.util.Cores;

public class Menu {
	Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		Banco contas = new Banco();
		ContaCorrente cc1 = new ContaCorrente(contas.gerarNumero(), "123", 1, "João da Silva", 1000f, 100.0f);
		contas.inserir(cc1);
		
		ContaCorrente cc2 = new ContaCorrente(contas.gerarNumero(), "124", 1, "Maria da Silva", 2000f, 100.0f);
		contas.inserir(cc2);
		
		ContaInss ci1 = new ContaInss(contas.gerarNumero(), "124", 2, "Maria da Silva", 2000f, 123456789);
		contas.inserir(ci1);


		
		
		int opcao, numero, tipo, numeroDeposito, beneficio = 0;
		String titular, agencia = "";
		float saldo, limite, valor = 0.0f;
		
		while(true) {

				System.out.println(Cores.TEXT_GREEN + "*********************************************************************" 
													+ Cores.TEXT_RESET);
				System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLUE_BACKGROUND 
													+ "                                                                     ");
				System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLUE_BACKGROUND
													+ "                       BANCO GENERATION BRASIL                       ");
				System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLUE_BACKGROUND 
													+ "                                                                     ");
				System.out.println(Cores.TEXT_RESET + Cores.TEXT_GREEN
													+ "*********************************************************************");
				System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLUE_BACKGROUND
														 + "                                                                     ");
				System.out.println(Cores.TEXT_GREEN_BOLD + "            1 - Criar Conta                                          ");
				System.out.println(Cores.TEXT_GREEN_BOLD + "            2 - Ver Saldo da Conta                                   ");
				System.out.println(Cores.TEXT_GREEN_BOLD + "            3 - Dados da Conta                                       ");
				System.out.println(Cores.TEXT_GREEN_BOLD + "            4 - Sacar                                                ");
				System.out.println(Cores.TEXT_GREEN_BOLD + "            5 - Depositar em Conta Corrente                          ");
				System.out.println(Cores.TEXT_GREEN_BOLD + "            6 - Transferir entre Contas Corrente                     ");
				System.out.println(Cores.TEXT_GREEN_BOLD + "            7 - Sair                                                 ");
				System.out.println(Cores.TEXT_GREEN_BOLD + "                                                                     " 
													+ Cores.TEXT_RESET);
				System.out.println(Cores.TEXT_GREEN + "*********************************************************************");
				System.out.println(Cores.TEXT_YELLOW + " Entre com a opção desejada:                         "
													+ Cores.TEXT_RESET);
				opcao = leia.nextInt();
				
				if (opcao == 7) {
					System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco Generation Brasil - O seu Futuro começa aqui!");
					leia.close();
					System.exit(0);
				}
				
				switch (opcao) {
				case 1:
					System.out.println(Cores.TEXT_WHITE + "Criar Conta Corrente\n\n");
					
					System.out.println("Digite o Numero da Agência: ");
					agencia = leia.next();
					System.out.println("Digite o Nome do Titular: ");
					leia.skip("\\R?");
					titular = leia.nextLine();
					
					do {
						System.out.println("Digite o Tipo da Conta (1-CC ou 2-CI): ");
						tipo = leia.nextInt();
					}while(tipo < 1 && tipo > 2);
						
					System.out.println("Digite o Saldo da Conta (R$): ");
					saldo = leia.nextFloat();
					
					if (tipo == 1) {
						System.out.println("Digite o Limite de Crédito (R$): ");
						limite = leia.nextFloat();
						contas.inserir(new ContaCorrente(contas.gerarNumero(),agencia,tipo,titular,saldo,limite));//assim cria uma conta corrente
						
						// Criar Conta Corrente
						
					}else {
						System.out.println("Digite o Numero do Benefício: ");
						beneficio = leia.nextInt();
						
						// Criar Conta INSS
						contas.inserir(new ContaInss(contas.gerarNumero(),agencia,tipo,titular,saldo,beneficio));//assim cria uma conta corrente

						
					}
										
					keyPress();
					
					break;
				case 2:
					System.out.println(Cores.TEXT_WHITE + "Visualizar Saldo\n\n");
					
					System.out.println("Digite o Numero da conta: ");
					numero = leia.nextInt();
							
					// Ver Saldo
					
					keyPress();
					
					break;
				case 3:
					
					System.out.println(Cores.TEXT_WHITE + "Consultar dados da Conta\n\n");
					
					System.out.println("Digite o Numero da conta: ");
					numero = leia.nextInt();
					
					contas.visualizar(contas.procurar(numero));
					
					// Ver dados da Conta
					
					keyPress();
	
					break;
				case 4:
					System.out.println(Cores.TEXT_WHITE + "Saque\n\n");
					
					System.out.println("Digite o Numero da conta: ");
					numero = leia.nextInt();
					System.out.println("Digite o Valor do Saque (R$): ");
					valor = leia.nextFloat();
					
					// Sacar
					contas.sacar(contas.procurar(numero), valor);
					
					keyPress();

					break;
				case 5:
					System.out.println(Cores.TEXT_WHITE + "Depositar\n\n");
					
					System.out.println("Digite o Numero da conta: ");
					numero = leia.nextInt();
					System.out.println("Digite o Valor do Depósito (R$): ");
					valor = leia.nextFloat();
					
					// Depositar - apenas Conta Corrente
					contas.depositar(contas.procurar(numero), valor);
					
					keyPress();
					
					break;
				case 6:
					
					System.out.println(Cores.TEXT_WHITE + "Transferência entre Contas\n\n");
					
					System.out.println("Digite o Numero da Conta de Origem: ");
					numero = leia.nextInt();
					System.out.println("Digite o Numero da Conta de Destino: ");
					numeroDeposito = leia.nextInt();
					System.out.println("Digite o Valor da Transferência (R$): ");
					valor = leia.nextFloat();
					
					// Transferir - apenas Conta Corrente
					contas.transferir(contas.procurar(numero), contas.procurar(numeroDeposito),valor);
					
					keyPress();
					
					break;
				default:
					
					System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!");
					keyPress();
					
					break;
			}
		}		
		
	}
	
	public static void keyPress() {
		
		try {
			
			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();
			
		} catch (IOException e) {
			
			System.out.println("Você pressionou uma tecla diferente de enter!");
			
		}finally {
			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
		
		}
		
		
		/*
		                //Conta(int numero, String agencia, int tipo, String titular, float saldo)
		//Conta conta = new Conta(133,"133",1,"Amanda Queiroz", 200000.f);
		//conta.imprimir();
		
		
		ContaCorrente conta = new ContaCorrente(133,"133",1,"Amanda Queiroz", 200000.f,10000.2f);
		conta.imprimir();
		ContaCorrente conta2 = new ContaCorrente(133,"133",2,"Amanda bn  nnnnnnnnnnnn", 200000.f,10000.2f);
		conta2.imprimir();
		
		//Banco banco = new Banco(conta);
		//banco.getConta().imprimir();		
		//Importa o METODO Conta(tem q esta com o memso nome com letra maiuscula se tiver)
		/*Conta c1 = new Conta(123,"123","CC","João Queiroz", 200.2f);
		            // Conta(int numero, String agencia, String tipo, String titular, float saldo)
		c1.imprimir();//pega o imprimir do metodo Conta
		Conta c2 = new Conta(133,"133","CC","Amanda Queiroz", 200000.f);
		c2.imprimir();
		          //(int numero, String agencia, String tipo, String titular, float saldo, float limite)
		ContaCorrente c3 = new ContaCorrente(133,"133","CC","Amanda Queiroz", 200000.f,10000.2f);
		c3.imprimir();
		
		ContaInss c4 = new ContaInss (133,"133","CC","Amanda Queiroz", 200000.f,5);
		c4.imprimir();*/
		
		
	/*	System.out.println("\nCliente: "+ c1.getTitular());
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
		
		c3.imprimir();*/
		
		
		 

	}


}
