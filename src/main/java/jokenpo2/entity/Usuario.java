package jokenpo2.entity;

import java.util.Scanner;

import jokenpo2.move.Move;

public class Usuario {
	private Scanner inputScanner = new Scanner(System.in);

	public Usuario() {}
		
	public Move getMove() {

        System.out.print("Digite (PE) Pedra, (PA) Papel, (TE) Tesoura, (LA) Lagarto ou (SP) Spock? ");

        // Obtendo a entrada

        String userInput = inputScanner.nextLine();
        userInput = userInput.toUpperCase();
        char primeiraLetra = userInput.charAt(0);
        char segundaLetra = userInput.charAt(1);

        if (primeiraLetra == 'P' && (segundaLetra == 'E' || segundaLetra == 'A') || primeiraLetra == 'T'
                || primeiraLetra == 'L' || primeiraLetra == 'S') {
            // O usuário digitou uma entrada válida

            switch (primeiraLetra) {
            case 'P':
                if (segundaLetra == 'E') {
                    return Move.PEDRA;
                } else {
                    return Move.PAPEL;
                }
            case 'T':
                return Move.TESOURA;
            case 'L':
                return Move.LAGARTO;
            case 'S':
                return Move.SPOCK;
            }

        }
        return getMove();

    }
	
	public boolean playAgain() {
        System.out.print("Você deseja jogar novamente? ");
        String userInput = inputScanner.nextLine();
        userInput = userInput.toUpperCase();
        return userInput.charAt(0) == 'S';
    }

	
	

} 