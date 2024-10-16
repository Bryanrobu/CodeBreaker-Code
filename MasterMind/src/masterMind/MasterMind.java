package masterMind;

import java.util.*;
import java.util.Random;

public class MasterMind {

	public static void main(String[] args) {

		Random rand = new Random();

		int attempts = 0;

		Scanner sc = new Scanner(System.in);

		int[] code = { rand.nextInt(7), rand.nextInt(7), rand.nextInt(7), rand.nextInt(7) };

		int score = 0;

		boolean validGuess = true;

		// Main Game Loop
		while (attempts < 10) {

			System.out.println("Numbers: 0-7");
			System.out.println("Attempt " + (attempts += 1) + ": Enter your guess: (example: 0 1 2 3) ");

			// automatic debugging on mismatch input and invalid numbers
			try {
				int[] guess = { sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt() };
				validGuess = true;
				for (int i = 0; i < 4; i++) {
					if (guess[i] > 7) {
						System.out.println("Number higher then 7 detected, try again with numbers in between 0 and 7.\n");
						attempts-=1;
						validGuess = false;
						break;
					}
					if (guess[i] < 0) {
						System.out.println("Number lower then 0 detected, try again with numbers in between 0 and 7.\n");
						attempts-=1;
						validGuess = false;
						break;
					}
				}
				// checking the code
				if (validGuess) {
					if (guess[0] == code[0]) {
						System.out.print("Black ");
						score = score + 1;
					} else if (guess[0] == code[1]) {
						System.out.print("White ");
					} else if (guess[0] == code[2]) {
						System.out.print("White ");
					} else if (guess[0] == code[3]) {
						System.out.print("White ");
					} else {
						System.out.print("- ");
					}

					if (guess[1] == code[1]) {
						System.out.print("Black ");
						score = score + 1;
					} else if (guess[1] == code[0]) {
						System.out.print("White ");
					} else if (guess[1] == code[2]) {
						System.out.print("White ");
					} else if (guess[1] == code[3]) {
						System.out.print("White ");
					} else {
						System.out.print("- ");
					}

					if (guess[2] == code[2]) {
						System.out.print("Black ");
						score = score + 1;
					} else if (guess[2] == code[0]) {
						System.out.print("White ");
					} else if (guess[2] == code[1]) {
						System.out.print("White ");
					} else if (guess[2] == code[3]) {
						System.out.print("White ");
					} else {
						System.out.print("- ");
					}

					if (guess[3] == code[3]) {
						System.out.println("Black ");
						score = score + 1;
					} else if (guess[3] == code[0]) {
						System.out.println("White ");
					} else if (guess[3] == code[1]) {
						System.out.println("White ");
					} else if (guess[3] == code[2]) {
						System.out.println("White ");
					} else {
						System.out.println("- ");
					}

					// shortcut to exit loop if you have all numbers correct
					if (score == 4)

					{
						attempts = 10;
					} else {
						score = 0;
					}
				}

				// catching a mistake made by writing down a different variable instead of an
				// integer
			} catch (InputMismatchException e) {
				
				System.out.println("Wrong input. Try placing 4 numbers divided by spaces.\n");
				sc.nextLine();
				attempts-=1;
				continue;
			}
		}
		// checking to see if you broke the loop by attempts, or by winning
		if (score == 4) {
			System.out.println("You have won! good job :D");
		} else {
			System.out.println("You have sadly lost, better luck next time! The code was: " + code[0] + "-" + code[1]
					+ "-" + code[2] + "-" + code[3]);

		}
		sc.close();
	}

}
