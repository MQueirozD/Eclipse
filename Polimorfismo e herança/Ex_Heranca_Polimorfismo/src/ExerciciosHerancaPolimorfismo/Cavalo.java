package ExerciciosHerancaPolimorfismo;

public class Cavalo extends Animal {
	private String correr;

	public Cavalo(String nome, int idade, String emitirSom, String correr) {
		super(nome, idade, emitirSom);
		this.correr = correr;
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	

}
