public class SnakeLadder {
	
	public static void main(String[] args) {
		System.out.println("Welcome to snake and ladder game.");

		//UC1 number of players = 1 and position = 0
		int player1Position = 0;              // when position = 100 player wins
		System.out.println("Player one position: " + player1Position);

		// UC2 the outcome of dice
		int dieRollOutcome = ((int) Math.floor(Math.random() * 10 ) % 6) +1;		// number came on rolling dice
		System.out.println("The outcome on rolling the die: " + dieRollOutcome);

	}
}