package jokenpo2.move;

import jokenpo2.entity.Usuario;

public class PedraPapelTesoura {

    public static void main(String[] args) {
        PedraPapelTesoura game = new PedraPapelTesoura();
         game.startGame();
     }

    public Usuario user;
    public Usuario user2;
    public Computador computer;
    private int userScore;
    private int user2Score;
    private int computerScore;
    private int numberOfGames;


    public PedraPapelTesoura() {

        user = new Usuario();
        user2 = new Usuario();
        computer = new Computador();
        userScore = 0;
        user2Score = 0;
        computerScore =0;
        numberOfGames= 0;

////        int qtdjogador;
//      
//      Scanner input = new Scanner(System.in);
//      System.out.println("Quantos jogadores vão Jogar? ");
//      qtdjogador = input.nextInt();
//      
//      String[] nomes = new String[qtdjogador];
//      
//      for(int i = 0; i<qtdjogador; i++) {
//          System.out.println("Entre com os nome do jogador: " +(i+1));
//          nomes[i] = input.next();
//          }
//          input.close();
//          
    }


    public void startGame() {
        System.out.println("PEDRA, PAPEL, TESOURA, LAGARTO OU SPOCK!");



        Move userMove = user.getMove();
        Move user2Move = user2.getMove();
        Move computerMove = computer.getMove();


        System.out.println("\n O jogador 1 escolheu " + userMove + ".");
        System.out.println("\n O jogador 2 escolheu " + user2Move + ".");
        System.out.println("O computador escolheu " + computerMove + ".\n");

        int compareMoves = userMove.compareMoves(user2Move);
        int compareMoves2 = userMove.compareMoves(computerMove);
        int compareMoves3 = computerMove.compareMoves(user2Move);

        switch (compareMoves) {
        case 0: // Empate
            System.out.println("Empate!");
            break;
        case 1:
            System.out.println(userMove + " ganha de " + user2Move + ". Jogador 1 venceu!");
            userScore++;
            break;
        case -1:
            System.out.println(user2Move + " ganha de " + userMove + ". Jogador 2 venceu!");
            user2Score++;

            break;

        }
        switch (compareMoves2) {
        case 0: // Empate
            System.out.println("Empate!");
            break;
        case 1:
            System.out.println(userMove + " ganha de " + computerMove + ". Jogador 1 venceu!");
            userScore++;
            break;
        case -1:
            System.out.println(user2Move + " ganha de " + computerMove + ". Jogador 2 venceu!");
            user2Score++;

            break;

        }

        switch (compareMoves3) {
        case 0: // Empate
            System.out.println("Empate!");
            break;
        case 1:
            System.out.println(computerMove + " ganha de " + user2Move + ". Computador venceu!");
            computerScore++;
            break;
        case -1:
            System.out.println(computerMove + " ganha de " + userMove + ". Computador venceu!");
            computerScore++;

            break;

        }



        numberOfGames++;

        // Pergunta ao usuário se ele deseja jogar novamente
       /* if (user.playAgain()) {
            System.out.println();
            startGame();
        } else {
            printGameStats();
        }*/
    }

    /**
     * Mostra as estatísticas do jogo. Considera os empates como 1/2 de uma vitória 
     * para definir a porcentagem de vitórias.
     */

    private void printGameStats() {
        int jogador1 = userScore;
        int jogador2 = user2Score;
        int computador = computerScore;
        int empate = numberOfGames - userScore - user2Score;



        // Imprimir valores
        System.out.printf(" Vitórias Jogador 1: " + userScore);
        System.out.printf("\n Vitórias Jogador 2: " + user2Score);
        System.out.println("\n Vitórias Computador : " + computerScore);
        System.out.printf(" Empates: " + empate);
        System.out.printf("\n Jogos realizados: " + numberOfGames);


    }
   }
