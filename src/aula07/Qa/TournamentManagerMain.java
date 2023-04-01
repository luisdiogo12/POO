package aula07.Qa;

import java.util.Scanner;

public class TournamentManagerMain {
    public static void main(String[] args) {
        TournamentManager chessTournament = new TournamentManager();
        TournamentManager checkersTournament = new TournamentManager();
        boolean  tournamentStarted = false;
        Scanner scanner = new Scanner(System.in);
        String choice = "";

        while (!choice.equals("7")) {
            System.out.println("TournamentManager Menu:");
            System.out.println("1. Add player");
            System.out.println("2. Remove player");
            System.out.println("3. Start game");           
            System.out.println("4. New round");
            System.out.println("5. Search player");
            System.out.println("6. Print tournament(s) info");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    if (tournamentStarted) {
                        System.out.println("Tournament already started.");
                    } else {
                        System.out.print("Enter player name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter player club: ");
                         String club = scanner.nextLine();
                        scanner.nextLine();
                        System.out.print("Enter player ELO: ");
                        int elo = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Chess player ou Checkers player? (Y para Chess, N para Checkers)");
                        String chessOrCheckers = scanner.nextLine();
                        if (chessOrCheckers.equals("Y")) {
                            chessTournament.addPlayer(new ChessPlayer(name, club, elo));
                        } else if (chessOrCheckers.equals("N")){
                            checkersTournament.addPlayer(new CheckersPlayer(name, club, elo));
                        } else {
                            System.out.println("Invalid input.");
                        }
                    }
                    break;
                case "2":
                    //todo quando remover quando o teorneio ja começou tem que dar a vitoria ao adversario
                    System.out.print("Enter player Id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    Player player = chessTournament.searchForPlayer(id);
                    if (player == null) {
                        player = checkersTournament.searchForPlayer(id);
                    } 
                    if (player == null) {
                        System.out.println("Player not found.");
                    } else {
                        chessTournament.removePlayer(player);
                        checkersTournament.removePlayer(player);
                    }

                case "3":
                    // início do(s) torneio(s)
                    
                    tournamentStarted = true;


                case "4":
                    // nova ronda (se torneio(s) terminado(s), nao 
                    // deve fazer nada)
                    if (tournamentStarted = false){
                        System.out.println("Torneio fechado");
                        break;
                    } 
                    if (chessTournament.nextRound() == false){
                        System.out.println("Torneio de xadrez fechado.");
                        break;
                    }
                    if (checkersTournament.nextRound() == false){
                        System.out.println("Torneio de damas fechado.");
                        break;
                    }


                case "5":
                    // procurar um jogador e imprimir as suas informações
                case "6":
                    // imprimir lista dos jogadores e respetiva pontuação
                case "7":
                    System.out.println("Exiting program.");
                    break;
                default:
                    // imprimir mensagem de erro
            }
        }
        scanner.close();
    }

}
