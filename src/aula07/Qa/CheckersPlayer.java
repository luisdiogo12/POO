package aula07.Qa;

public class CheckersPlayer extends Player{

	private int elo; //todo gerado aleatoriamnete entre 1 e 50

	public CheckersPlayer(String name, String club, int elo) {
		super(name, club);
		this.elo = eloGenerator();
	}
	
	private int eloGenerator() {
		return (int) (Math.random() * 50 + 1);
	}

	public int getElo() {
		return elo;
	}
}
