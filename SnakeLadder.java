public class SnakeLadder {
	public static final int NO_PLAY = 0;			// no change in player position
	public static final int SNAKE = 1;				// decrement player position
	public static final int LADDER = 2;				// increment player position
	public static final int WIN_POSITION = 100;				// players wins if final position is 100

	public static void main(String[] args) {
		System.out.println("Welcome to snake and ladder game.");

		//UC1 number of players = 1 and position = 0
		int player1Position = 0;              // when initial position = 0
		
		//UC4 players wins if final position is WIN_POSITION
		while (player1Position < WIN_POSITION) {
			//System.out.println("Player one position: " + player1Position);
			
			int dieRollOutcome = ((int) Math.floor(Math.random() * 10 ) % 6) +1;		// number came on rolling dice
			//System.out.println("The outcome on rolling the die: " + dieRollOutcome);

			int playPositionOption = ((int) Math.floor(Math.random() * 10 ) % 3);	//type- NO_PLAY, SNAKE or LADDER
			//System.out.println("Type of option: " + playPositionOption);

			if(playPositionOption == LADDER) {
				player1Position += dieRollOutcome;
				if (player1Position > WIN_POSITION) {					
					player1Position -= dieRollOutcome;			//no change in position if position > WIN_POSITION
				}
			} else if (playPositionOption == SNAKE) {
				player1Position -= dieRollOutcome;
			}
			if (player1Position < 0) {
				player1Position = 0;				//game restarts if position moves below 0		
			}

		}

		System.out.println("Player wins!!! The final position of player 1: "+ player1Position);
	}
}