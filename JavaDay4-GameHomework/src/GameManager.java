
public class GameManager implements GameService{

	@Override
	public void addGame(Game game) {
		System.out.println(game.gameId+ " numaralý "+ game.gameName+ " oyununu baþarýyla aldýnýz.");
		
	}

	@Override
	public void updateGame(Game game) {
		System.out.println(game.gameId+" numaralý "+ game.gameName+ " oyununu baþarýyla güncellediniz.");
		
	}

	@Override
	public void deleteGame(Game game) {
		System.out.println(game.gameId+" numaralý "+ game.gameName+ " oyununu baþarýyla sildiniz.");
		
	}
	
	
	
	
}
