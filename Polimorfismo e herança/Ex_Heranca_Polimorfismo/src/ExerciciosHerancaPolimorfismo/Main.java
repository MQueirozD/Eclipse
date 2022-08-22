package ExerciciosHerancaPolimorfismo;

public class Main {
/*1- Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
características de forma que tudo o que for comum a todos os animais fique na classe
Animal:

2- Implemente um programa que crie os 3 tipos de animais definidos no exercício
anterior e invoque o método que emite o som de cada um de forma polimórfica, isto
é, independente do tipo de animal.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
						//Cachorro(String nome, int idade, String emitirSom, String correr)
		Cachorro dog = new Cachorro("Blitz", 2, " Latir, Rosnar, Ganir", "com quatro patas");	
		System.out.println("\nNome do chachorro é: "+ dog.getNome()+"\nIdade: "+dog.getIdade()+" anos"+
		"\nEmite o som: "+dog.getEmitirSom()+"\nCorre: "+dog.getCorrer());
		
					//Cavalo(String nome, int idade, String emitirSom, String correr)
		Cavalo horse = new Cavalo("Pé de pano", 6, " Relinchar, Rinchar, Bufar", "com quatro patas");
		System.out.println("\nNome do cavalo é: "+ horse.getNome()+"\nIdade: "+horse.getIdade()+" anos"+
				"\nEmite o som: "+horse.getEmitirSom()+"\nCorre: "+horse.getCorrer());
				
					//Preguica(String nome, int idade, String emitirSom)
		Preguica sloth = new Preguica("Flash", 10, " de alta-frequência pelas narinas");
		System.out.println("\nNome do Preguica é: "+ sloth.getNome()+"\nIdade: "+sloth.getIdade()+" anos"+
				"\nEmite o som: "+sloth.getEmitirSom());
		

	}

}
