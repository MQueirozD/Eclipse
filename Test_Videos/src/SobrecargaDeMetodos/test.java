package SobrecargaDeMetodos;

public class test {
	public void testaMetodosSobrecarragos() {
		System.out.printf("\nSalário em números inteiros: %d \n",salario(1000));
		System.out.printf("\nSalário em números doubles: %f \n",salario(7.500));
		//System.out.printf("\nSalário em números inteiros: %d \n",salario(1000));
	}
	public int salario(int valorInt) {
		System.out.printf("\nQaul seu salário em números inteiros: %d \n",valorInt);
		return valorInt * valorInt;
	}
	public double salario(double valorDouble) {
		System.out.printf("\nQaul seu salário em números doubles: %f \n",valorDouble);
		return valorDouble * valorDouble;
	}
}
