
public class Game{
	
	String gameId;
	String gameName;
	String gamePrice;
	
	public Game() {
		
	}
	
	public Game(String gameId, String gameName, String gamePrice) {
		this.gameId = gameId;
		this.gameName = gameName;
		this.gamePrice = gamePrice;
	}


	public String getGameId() {
		return gameId;
	}


	public void setGameId(String gameId) {
		this.gameId = gameId;
	}


	public String getGameName() {
		return gameName;
	}


	public void setGameName(String gameName) {
		this.gameName = gameName;
	}


	public String getGamePrice() {
		return gamePrice;
	}


	public void setGamePrice(String gamePrice) {
		this.gamePrice = gamePrice;
	}
	
	
	
	
}
