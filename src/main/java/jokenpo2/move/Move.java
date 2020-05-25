package jokenpo2.move;
	
	public enum Move {

	    PEDRA, PAPEL, TESOURA, LAGARTO, SPOCK;

	       public int compareMoves(Move otherMove) {
	            // Tie
	            if (this == otherMove)
	                return 0;

	           switch (this) {

	           // ? IGUAL A IF E O (:) IGUAL A ELSE
	            case PEDRA:
	                return (otherMove == TESOURA ? 1 :(otherMove == LAGARTO ? 1 : -1));
	            case PAPEL:
	                return (otherMove == PEDRA ? 1 :(otherMove == SPOCK ? 1 : -1));
	            case TESOURA:
	                return (otherMove == PAPEL ? 1 :(otherMove == LAGARTO ? 1 : -1)); 
	            case LAGARTO:
	                return (otherMove == SPOCK ? 1 :(otherMove == PAPEL ? 1 : -1));
	            case SPOCK:
	                return (otherMove == PEDRA ? 1 :(otherMove == TESOURA ? 1 : -1));
	           }return 0; 


	       }
	        public static void main(String[] args) {
	           PedraPapelTesoura game = new PedraPapelTesoura();
	            game.startGame();
	        }

	

}
