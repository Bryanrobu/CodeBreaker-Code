package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HighLow {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("hello and welcome to higher or lower,");
		System.out.println("In this game your going to try to guess my number");
		System.out.println("Goodluck!!!, start guessing numbers in between 0 and 100:");
		
		try {
		String guess = sc.next();
		
		
		
		
		
		} catch (InputMismatchException e) {
			System.out.println("Looks like you entered a wrong input, try again please: ");
		}

	}

}
