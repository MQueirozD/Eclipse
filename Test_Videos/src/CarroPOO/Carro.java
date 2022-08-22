package CarroPOO;

public class Carro {
	String cor;
	String modelo;
	double veloAtual;
	double veloMaxima;
	
	void liga() {
		System.out.println("\nCarro esta ligado...");
	}
	void acelera (double quantidade) {
		double veloNova = this.veloAtual + quantidade;
		this.veloAtual = veloNova;
	}
	
	int pegaMarcha() {
		if (this.veloAtual<0) {
			return -1;
		}
		if (this.veloAtual>= 0 && this.veloAtual < 20) {
			return 1;
		}
		if (this.veloAtual>= 20 && this.veloAtual<40 ) {
			return 2;
		}
		if (this.veloAtual>= 40 && this.veloAtual<80) {
			return 3;
		}
		if (this.veloAtual>= 80 && this.veloAtual<100) {
			return 4;
		}
		return 5;
	}

}
