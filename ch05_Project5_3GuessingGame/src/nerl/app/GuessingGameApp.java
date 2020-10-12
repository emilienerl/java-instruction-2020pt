package nerl.app;

public class GuessingGameApp {

	public static void main(String[] args) {

		/*
		 * instance variable numToGuess and calling getRandomInt method that is in the
		 * NumberUtil class
		 */

		System.out.println("Welcome to the Guess the Number Game");
		System.out.println("++++++++++++++++++++++++++++++++++++");

		int numToGuess = NumberUtil.getRandomInt(100);

		// the number user is supposed to guess. added to check to make sure game is
		// running correctly.
		System.out.println(numToGuess);

		int userGuess = 0;
		int numGuesses = 0;

		while (userGuess != numToGuess) {
			numGuesses++;
			// getting users guess
			// user starts playing the game
			userGuess = Console.getInt("Enter number: ", 1, 100);

			if (userGuess > (10 + numToGuess)) {
				System.out.println("Way too high! Guess again.\r\n");
			} else if (userGuess > numToGuess) {
				System.out.println("Too high! Guess again.\r\n");
			} else if (userGuess < (numToGuess - 10)) {
				System.out.println("Too low! Guess again.\r\n");
			} else if (userGuess < numToGuess) {
				System.out.println("Too low! Guess again.\r\n");
			} else {
				System.out.println(
						"You got it in " + numGuesses + " tries.\n" + "Great work! You are a mathematical wizard.");
			}
		}

	}
}
