package Heranca;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa p = new Pessoa("Mateus",1234);
		Funcionario f = new Funcionario("Pedro",456,"Novo Funcionaro");
		Pessoa p1 = new Funcionario ("Maria",333,"Informatica");
		Pessoa p2 = new Cordenado("Jose",555,"Matematica");
		
		System.out.println("Matricular: "+p.getMatricula());
		System.out.println("Matricular: "+f.getMatricula());
		System.out.println("Matricular: "+p1.getMatricula());
		System.out.println("Matricular: "+p2.getMatricula());
		

	}

}
