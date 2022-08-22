package POO;

import java.util.Scanner;

public class Nome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		String pimeiroNome, ultimoNome, meioNome;
		System.out.println("Digite seu primeiro nome: ");
		pimeiroNome = ler.next();
		System.out.println("Digite seu nome do meio: ");
		meioNome = ler.next();
		System.out.println("Digite seu ultimo nome: ");
		ultimoNome = ler.next();		
		Pessoa p = new Pessoa(pimeiroNome, ultimoNome, meioNome);
		System.out.println("\nSeu nome completo é: " + p.getNomeCompleto());
		

	}

}
