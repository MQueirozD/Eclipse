package CarroPOO;

import java.util.Iterator;
import java.util.Scanner;

public class TestCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
				
		Carro c = new Carro();
		c.cor ="Preto";
		c.modelo = "Celtinha";
		c.veloAtual = 0;
		c.veloMaxima = 110;
		
		System.out.println("\nSeu carro é o : " + c.modelo);
		System.out.println("\nCom a cor: "+ c.cor);
		c.liga();
		System.out.println("\n");
		/*c.acelera(10);
		System.out.println(c.veloAtual + "Km" +"\nesta na marcha: " +  c.pegaMarcha());
		c.acelera(+10);
		System.out.println(c.veloAtual + "Km" +"\nesta na marcha: " +  c.pegaMarcha());*/
		for (int i=0;i<=15;i++) {			
			c.acelera(i);
			System.out.println(c.veloAtual + "Km" +"   esta na marcha: " +  c.pegaMarcha());
			
		}
		
		
		

	}

}
