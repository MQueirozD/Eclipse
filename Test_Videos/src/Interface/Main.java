package Interface;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParticipanteForum p = new ParticipanteForum();
		Leitor l = p;
		System.out.println("O participante esta lendo: "+ l.lendo());
		Programador pro = p;
		String java = "JAVA";
		pro.pensando(java.toCharArray());
		System.out.println("\nE programando: "+ p.digitando());
		
	}

}
