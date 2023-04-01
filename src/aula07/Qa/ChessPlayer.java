package aula07.Qa;

public class ChessPlayer extends Player{

	private int elo; //todo gerado aleatoriamnete entre 1 e 100

	public ChessPlayer(String name, String club, int elo) {
		super(name, club);
		this.elo = eloGenerator();
	}
	
	private int eloGenerator() {
		return (int) (Math.random() * 100 + 1);
	}

	public int getElo() {
		return elo;
	}


	
}
