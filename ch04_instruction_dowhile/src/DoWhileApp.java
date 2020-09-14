import java.util.Scanner;

public class DoWhileApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String word;

		do {
			System.out.print("Say the magic word: ");
			word = sc.next();

			// if they don't enter in please it will loop again until user enters please

		} while (!word.equalsIgnoreCase("please"));

		System.out.println("Thank you");

	}

}
