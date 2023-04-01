package aula07.Qa;

//todo gerir torneios emparelhando jogadores em cada ronda e refista resultados
public class TournamentManager implements ITournamentManager{

	private static Player[] playerArray;
	private static int currentRound = 0;

	@Override
	public void addPlayer(Player player) {
		if (playerArray == null){
			playerArray = new Player[1];
			playerArray[0] = player;
		}else{
			Player[] newArray = new Player[playerArray.length + 1];
			for (int i = 0; i < playerArray.length; i++){
				newArray[i] = playerArray[i];
			}
			newArray[playerArray.length] = player;
			playerArray = newArray;
		}
	}
	

	@Override
	public void removePlayer(Player player) {
		for (Player splayer : playerArray){
			if (player == splayer){
				Player[] newArray = new Player[playerArray.length - 1];
				int i = 0;
				int j = 0; //contador para o novo array
				while( i < playerArray.length){
					if (playerArray[i] != player){
						newArray[j] = playerArray[i];
						j++; // assim salta o elemento a remover e não ficam espaços vazios
					}
					i++;
				}
		}else{
			System.out.println("Numero nao presente no conjunto");
		}
		}
	}

	@Override
	public Player searchForPlayer(String nome) {

		for (Player player : playerArray){
			if (player.getName() == nome){
				return player;
			}
		}
		return null;
		
	}

	@Override
	public Player searchForPlayer(int ID) {
		for (Player player : playerArray){
			if (player.getId() == ID ){
				return player;
			}
		}
		return null;
	}

	@Override
	public void printTournaments() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'printTournaments'");
	}

	@Override
	public boolean nextRound() {
		for (Player p : playerArray) {
            for (Player p2 : playerArray) {
                if (p != p2) {
					int result = resultGame(p, p2);
					if (result == 1) {
						p.setElo(p.getElo() + 1);
						p2.setElo(p2.getElo() - 1);
					} else if (result == 0) {
						p.setElo(p.getElo() - 1);
						p2.setElo(p2.getElo() + 1);
					}
				}
			}
		}
		return false;				
	}


	public Player[] getPlayers() {
		return playerArray;
	}

	private int resultGame(Player player1 , Player player2){
       int ELO_JOGO = player1.getElo + player2.getElo;
	   Double rand = (double) (Math.random() * ELO_JOGO);
	   if (rand< player1.getElo*0,8){
		   return 1;
	   }else if (rand > player1.getElo + 0,2*player2.getElo){
		   return 0;
	   }else{
		   return 2;
	   }
    }




}
