package Ex1;

public class Cliente {
	/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
	
	private int nCliente;
	private String nome,rua,produto,telefone;
	private int idade,numRua,cep;	
	
	
	public Cliente(int nCliente, String nome, String rua, String produto, String telefone, int idade, int numRua,	int cep) {
		this.nCliente = nCliente;
		this.nome = nome;
		this.rua = rua;
		this.produto = produto;
		this.telefone = telefone;
		this.idade = idade;
		this.numRua = numRua;
		this.cep = cep;
	}

	public int getnCliente() {
		return nCliente;
	}
	
	public void setnCliente(int nCliente) {
		this.nCliente = nCliente;
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
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
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
		System.out.println("\nNúmero do cliente: " + this.nCliente);
		System.out.println("\nNome cliente: " + this.nome);
		System.out.println("\nRua: " + this.rua);
		System.out.println("\nNNúmero: " + this.telefone);
		System.out.println("\nCEP: "+ this.cep);
		System.out.println("\nIdade: " + this.idade);
		System.out.println("\nProduto: " + this.produto);
		System.out.println("\n----------------------------------------");
	}
	

}
