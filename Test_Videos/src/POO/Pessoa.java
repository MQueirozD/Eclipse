package POO;

public class Pessoa {
	private String pimeiroNome;//qr dizer q so a CLASSE PESSOA pode modificar
	private String ultimoNome;
	private String meioNome;
	public Pessoa(String pimeiroNome, String ultimoNome, String meioNome) {
		this.pimeiroNome = pimeiroNome;
		this.ultimoNome = ultimoNome;
		this.meioNome = meioNome;
	}
	public String getPimeiroNome() {//public ql qr CLASSE pode modificar
		return pimeiroNome;
	}
	public void setPimeiroNome(String pimeiroNome) {
		this.pimeiroNome = pimeiroNome;
	}
	public String getUltimoNome() {
		return ultimoNome;
	}
	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}
	public String getMeioNome() {
		return meioNome;
	}
	public void setMeioNome(String meioNome) {
		this.meioNome = meioNome;
	}
	
	public String getNomeCompleto() {
		String nomeCompleto = pimeiroNome + " " + meioNome + " " + ultimoNome;
		return nomeCompleto;
	}
	

}
