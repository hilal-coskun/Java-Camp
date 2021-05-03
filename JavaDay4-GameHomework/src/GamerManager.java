
public class GamerManager implements GamerService{

	@Override
	public void gamerRegister(Gamer gamer) {
		System.out.println(gamer.firstName+ " baþarýyla kayýt oldunuz.");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.firstName+ " bilgileriniz baþarýyla güncelledi.");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.firstName+ " kaydýnýz baþarýyla silinmiþtir.");
		
	}
	
	
	
}
