
public class GameManager implements GameService{

	@Override
	public void addGame(Game game) {
		System.out.println(game.gameId+ " numaral� "+ game.gameName+ " oyununu ba�ar�yla ald�n�z.");
		
	}

	@Override
	public void updateGame(Game game) {
		System.out.println(game.gameId+" numaral� "+ game.gameName+ " oyununu ba�ar�yla g�ncellediniz.");
		
	}

	@Override
	public void deleteGame(Game game) {
		System.out.println(game.gameId+" numaral� "+ game.gameName+ " oyununu ba�ar�yla sildiniz.");
		
	}
	
	
	
	
}
