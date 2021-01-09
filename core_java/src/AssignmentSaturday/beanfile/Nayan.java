package AssignmentSaturday.beanfile;

public class Nayan {
	
		private String gameName;
		private int ranking;
		private int players; 
		
	public Nayan() {
		
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public int getPlayers() {
		return players;
	}

	public void setPlayers(int players) {
		this.players = players;
	}

	public Nayan(String gameName, int ranking, int players) {
		super();
		this.gameName = gameName;
		this.ranking = ranking;
		this.players = players;
	}

	@Override
	public String toString() {
		return "Nayan [gameName=" + gameName + ", ranking=" + ranking + ", players=" + players + "]";
	}

	


}
