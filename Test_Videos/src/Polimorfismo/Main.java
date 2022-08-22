package Polimorfismo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PessoaFisica pf = new PessoaFisica();
		pf.setNome("Mateus");
		pf.setCpf(1234567894564651321L);//coloca o L pq ele é tipo LONG
		//System.out.println(pf.getNome()+pf.getCpf());
		PessoaJuridica pj = new PessoaJuridica();
		pj.setNome("Jorge");
		pj.setCnpj(101010101010100L);
		//System.out.println(pj.getNome()+pj.getCnpj());
		
		Pessoa[] p = new Pessoa[2];//isso é um ARRAY []
		p[0]=pf;
		p[1]=pj;
		
		for(Pessoa pessoa :p) {
			System.out.println(pessoa.getNome());//pega tudo q esta na classe PESSOA(PESSOAJURIDICA E PESSOAFISICA)
		}
		

	}

}
