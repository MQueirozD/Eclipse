package Heranca;

public class Cordenado extends Pessoa{
	private String cursoCordenado;

	public Cordenado(String nome, int matricula, String cursoCordenado) {
		super(nome, matricula);
		this.cursoCordenado = cursoCordenado;
	}

	public String getCursoCordenado() {
		return cursoCordenado;
	}

	public void setCursoCordenado(String cursoCordenado) {
		this.cursoCordenado = cursoCordenado;
	}
	
	

}
