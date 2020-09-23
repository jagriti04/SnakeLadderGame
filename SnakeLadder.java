public class SnakeLadder {
	
	public static void main(String[] args) {
		System.out.println("Welcome to snake and ladder game.");
		
		// defining game variables 
		int SAFE_PLACE = 0;
		int SNAKE_PLACE = 1;
		int LADDER_PLACE = 2;

		int dieRoll = 0;							// number came on rolling dice
		//UC1 number of players = 1 and position = 0
		int player1Position = 0;              // when position = 100 player wins

		System.out.println("Player one position: " + player1Position);
	}
}