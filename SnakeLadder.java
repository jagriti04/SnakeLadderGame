public class SnakeLadder {
	public static final int NO_PLAY = 0;			// no change in player position
	public static final int SNAKE = 1;				// decrement player position
	public static final int LADDER = 2;				// increment player position

	public static void main(String[] args) {
		System.out.println("Welcome to snake and ladder game.");

		//UC1 number of players = 1 and position = 0
		int player1Position = 0;              // when position = 100 player wins
		System.out.println("Player one position: " + player1Position);

		// UC2 the outcome of dice
		int dieRollOutcome = ((int) Math.floor(Math.random() * 10 ) % 6) +1;		// number came on rolling dice
		System.out.println("The outcome on rolling the die: " + dieRollOutcome);

		// UC3 change position based on type of option
		int playPositionOption = ((int) Math.floor(Math.random() * 10 ) % 3);	//type- NO_PLAY, SNAKE or LADDER
		System.out.println("Type of option: " + playPositionOption);

		if(playPositionOption == LADDER) {
			player1Position += dieRollOutcome;
		} else if (playPositionOption == SNAKE) {
			player1Position -= dieRollOutcome;
		}

		System.out.println("The final position of player 1: "+ player1Position );
	}
}