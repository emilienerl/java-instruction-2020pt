package nerl.app;

public class NumberUtil {

	// Math.random method to get the random number and save as an integer
	// Static method

	public static int getRandomInt(int limit) {
		double d = Math.random() * limit; // d is >= 0.0 and < limit
		int randomInt = (int) d; // convert double to int
		randomInt++; // int is >= 1 and <= limit
		return randomInt;

	}

}
