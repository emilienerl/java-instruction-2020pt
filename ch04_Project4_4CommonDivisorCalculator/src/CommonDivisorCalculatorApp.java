
public class CommonDivisorCalculatorApp {

	public static int calculateGreatestCommonDivisor(int x, int y) {
		while (x != 0) {
			while (y >= x) {
				// System.out.println("In while loop with " + x + " and " + y);
				y = y - x;
			}

			int tmp = x;
			x = y;
			y = tmp;
		}

		return y;
	}

	public static void main(String[] args) {

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			int firstNumber = Console.getInt("Enter first number: ");
			int secondNumber = Console.getInt("Enter second number: ");

			int gCD = calculateGreatestCommonDivisor(firstNumber, secondNumber);
			System.out.println("Greatest Common Divisor " + gCD);

			System.out.println();

			choice = Console.getString("Continue? (y/n)");
		}

	}

}
