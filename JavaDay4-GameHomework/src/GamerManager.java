
public class GamerManager implements GamerService{

	@Override
	public void gamerRegister(Gamer gamer) {
		System.out.println(gamer.firstName+ " ba�ar�yla kay�t oldunuz.");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.firstName+ " bilgileriniz ba�ar�yla g�ncelledi.");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.firstName+ " kayd�n�z ba�ar�yla silinmi�tir.");
		
	}
	
	
	
}
