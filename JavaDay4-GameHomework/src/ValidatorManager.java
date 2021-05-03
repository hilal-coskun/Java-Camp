
public class ValidatorManager implements ValidatorService{

	@Override
	public boolean validate(Gamer gamer) {
		if(gamer.getTcNo().length()==11 && gamer.getBirthDate()< 2006) {
			System.out.println("Baþarýlý giriþ");
			return true;
		}
		else {
			System.out.println("Baþarýsýz giriþ");
			return false;
		}
	}
	
}
