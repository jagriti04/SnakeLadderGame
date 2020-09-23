public class SnakeLadder {
	public static final int NO_PLAY = 0;			// no change in player position
	public static final int SNAKE = 1;				// decrement player position
	public static final int LADDER = 2;				// increment player position
	public static final int WIN_POSITION = 100;				// players wins if final position is 100

	public static void main(String[] args) {
		System.out.println("Welcome to snake and ladder game.");

		//UC6 add player2 
		int player1Position = 0, player2Position=0;          // when initial position = 0
		int totalDiceRolls1 = 0, totalDiceRolls2=0;				// to find the no. of times dice rolled
		int player = 1;							// if 1 then player 1 will play else if 2 then player 2	

		//UC6 two player game
		while (player1Position < WIN_POSITION && player2Position < WIN_POSITION) {
			
			if (player == 1) {
				player = 2;
				totalDiceRolls1++;

				
				int dieRollOutcome1 = ((int) Math.floor(Math.random() * 10 ) % 6) +1;		// number came on rolling dice
				int playPositionOption1 = ((int) Math.floor(Math.random() * 10 ) % 3);	//type- NO_PLAY, SNAKE or LADDER

				if(playPositionOption1 == LADDER) {
					player = 1;
					player1Position += dieRollOutcome1;
					if (player1Position > WIN_POSITION) {					
						player1Position -= dieRollOutcome1;			//no change in position if position > WIN_POSITION
					}
				} else if (playPositionOption1 == SNAKE) {
					player1Position -= dieRollOutcome1;
					if (player1Position < 0) {
						player1Position = 0;				//game restarts if position moves below 0		
					}
				}
			} else {
				player = 1;
				totalDiceRolls2++;
				
				int dieRollOutcome2 = ((int) Math.floor(Math.random() * 10 ) % 6) +1;		// number came on rolling dice
				int playPositionOption2 = ((int) Math.floor(Math.random() * 10 ) % 3);	//type- NO_PLAY, SNAKE or LADDER

				if(playPositionOption2 == LADDER) {
					player = 2;
					player2Position += dieRollOutcome2;
					if (player2Position > WIN_POSITION) {					
						player2Position -= dieRollOutcome2;			//no change in position if position > WIN_POSITION
					}
				} else if (playPositionOption2 == SNAKE) {
					player2Position -= dieRollOutcome2;
					if (player2Position < 0) {
						player2Position = 0;				//game restarts if position moves below 0		
					}
				}
			}
			
		}

		System.out.println("Total no. of time dice rolled by player 1= " + totalDiceRolls1);
		System.out.println("Total no. of time dice rolled by player 2= " + totalDiceRolls2);
		if (player1Position == WIN_POSITION) {
			System.out.println("Winner is Player1");
			System.out.println("The final position of player 1: "+ player1Position);
			System.out.println("The final position of player 2: "+ player2Position);
		} else if (player2Position == WIN_POSITION) {
			System.out.println("Winner is Player2");
			System.out.println("The final position of player 1: "+ player1Position);
			System.out.println("The final position of player 2: "+ player2Position);
		}

		
	}
}