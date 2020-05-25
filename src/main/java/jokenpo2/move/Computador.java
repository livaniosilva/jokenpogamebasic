package jokenpo2.move;
import java.util.Random;

public class Computador {

	    public Move getMove() {


	            Move[] escolha = Move.values();
	            Random random = new Random();
	            int index = random.nextInt(escolha.length);
	            return escolha[index];
	        }
	
	
}


