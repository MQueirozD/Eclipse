public class Funcionarios {
	
/*4) Crie uma classe funcionário e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto funcionário, defina as
instancias deste objeto e apresente as informações deste objeto no
console.*/
	
	private int codigoFuncionario;
	private String nome,rua,telefone,cpf;
	private int idade,numRua,cep;
	public Funcionarios(int codigoFuncionario, String nome, String rua, String telefone, String cpf, int idade,	int numRua, int cep) {
		this.codigoFuncionario = codigoFuncionario;
		this.nome = nome;
		this.rua = rua;
		this.telefone = telefone;
		this.cpf = cpf;
		this.idade = idade;
		this.numRua = numRua;
		this.cep = cep;
	}
	public int getCodigoFuncionario() {
		return codigoFuncionario;
	}
	public void setCodigoFuncionario(int codigoFuncionario) {
		this.codigoFuncionario = codigoFuncionario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getNumRua() {
		return numRua;
	}
	public void setNumRua(int numRua) {
		this.numRua = numRua;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	
	public void imprimir() {
		//chama todos os this e fizemos como se fosse um menu
		System.out.println("\n-----------------------------------------");
		System.out.println("\n\tDados da conta");
		System.out.println("\n----------------------------------------");
		System.out.println("\nNúmero do cliente: " + this.codigoFuncionario);
		System.out.println("\nNome cliente: " + this.nome);
		System.out.println("\nRua: " + this.rua);
		System.out.println("\nRua: " + this.numRua);
		System.out.println("\nNNúmero: " + this.telefone);
		System.out.println("\nCEP: "+ this.cep);
		System.out.println("\nIdade: " + this.idade);
		System.out.println("\nCPF: " + this.cpf);
		System.out.println("\n----------------------------------------");
	}
	  	

}
