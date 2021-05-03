
public class Main {

	public static void main(String[] args) {
		
		
		
		
		Gamer gamer1 = new Gamer();
		gamer1.id=1;
		gamer1.tcNo="12345678923";
		gamer1.birthDate=2000;
		gamer1.email="hilal.coskun20@gmail.com";
		gamer1.firstName="Hilal";
		gamer1.lastName="Coskun";
		
		Gamer gamer2 = new Gamer();
		gamer2.id=2;
		gamer2.tcNo="12345678913";
		gamer2.birthDate=2000;
		gamer2.email="hilal.coskun20@gmail.com";
		gamer2.firstName="Hilal";
		gamer2.lastName="Coskun";
		
		GamerManager gamerManager= new GamerManager();
		gamerManager.gamerRegister(gamer1);
		gamerManager.update(gamer2);
		gamerManager.delete(gamer1);
		
		ValidatorManager validator= new ValidatorManager();
		validator.validate(gamer1);
		validator.validate(gamer2);
		
		
		Campaign campaign= new Campaign();
		campaign.campaignName="Yýlbaþý Indirimi";
		campaign.campaignDiscount="%30";
		
		Game game1= new Game();
		game1.gameId="1";
		game1.gameName="LOL";
		game1.gamePrice="100";
		
		Game game2= new Game();
		game2.gameId="2";
		game2.gameName="Call Of Duty";
		game2.gamePrice="150";
		
		GameManager gameManager= new GameManager();
		gameManager.addGame(game1);
		gameManager.deleteGame(game2);
		gameManager.updateGame(game1);
		
		SalesManager salesManager= new SalesManager();
		salesManager.campaignSales(gamer1, game1, campaign);
		salesManager.campaignSales(gamer2, game2, campaign);
		
		
		
	}


}
