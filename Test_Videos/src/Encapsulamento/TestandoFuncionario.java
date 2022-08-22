package Encapsulamento;

public class TestandoFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario f = new Funcionario();
		f.setNome("Mateus");
		f.setSalario(6500);
		
		System.out.println("\nSeu nome é: "+f.getNome() + " com o salário de R$ "+ f.getSalario());

	}

}
