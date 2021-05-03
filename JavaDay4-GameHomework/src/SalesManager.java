
public class SalesManager implements SalesService{

	@Override
	public void sales(Gamer gamer, Game game) {
		System.out.println(game.gameName + " adlý kullanýcý "+ game.gameName+" oyununu "+ game.gamePrice +"baþarýyla satýn aldý.");
		
	}

	@Override
	public void campaignSales(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(game.gameName+ " adlý kullanýcý "+ game.gameName+" adlý oyunu "+ campaign.campaignDiscount+" kampanyasý dahilinde kursu baþarýyla aldýnýz.");
	
	}
	
}
