import java.util.Scanner;

public class GradeConverterApp {

	public static void main(String[] args) {
		//every time there's the word continue there is a while loop
		
		// welcome message
		System.out.println("Welcome to the Letter Grade Converter");
		
		Scanner sc = new Scanner (System.in);
		
		// while loop- loop while 'choice == 'y'
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
	
		// get numerical grade
		System.out.println("Enter numerical grade: ");
		int numericalGrade = sc.nextInt();
		String letterGrade = "";
		
		// convert to letter grade
		if (numericalGrade >= 88) {
			letterGrade = "A";
		}
		else if (numericalGrade >= 80) {
			letterGrade = "B";
		}
		else if (numericalGrade >= 67) {
			letterGrade = "C";
		}	
		else if (numericalGrade >= 60) {
		letterGrade = "D";
		}	
		else {
		letterGrade = "F";
		}	
		
		// user output
		System.out.println("Letter Grade: " + letterGrade);
		System.out.println("Continue?");
		choice = sc.next();
		
		// goodbye message

	}
	}

}
