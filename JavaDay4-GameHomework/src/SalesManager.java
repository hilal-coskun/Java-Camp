
public class SalesManager implements SalesService{

	@Override
	public void sales(Gamer gamer, Game game) {
		System.out.println(game.gameName + " adl� kullan�c� "+ game.gameName+" oyununu "+ game.gamePrice +"ba�ar�yla sat�n ald�.");
		
	}

	@Override
	public void campaignSales(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(game.gameName+ " adl� kullan�c� "+ game.gameName+" adl� oyunu "+ campaign.campaignDiscount+" kampanyas� dahilinde kursu ba�ar�yla ald�n�z.");
	
	}
	
}
