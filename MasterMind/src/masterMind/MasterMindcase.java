package masterMind;

import java.util.*;
import java.util.Random;

public class MasterMindcase {

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
						attempts -= 1;
						validGuess = false;
						break;
					}
					if (guess[i] < 0) {
						System.out.println("Number lower then 0 detected, try again with numbers in between 0 and 7.\n");
						attempts -= 1;
						validGuess = false;
						break;
					}
				}
				// checking the code
				if (validGuess) {
					for (int o = 0; o < 4; o++) {
						if (guess[o] == code[o]) {
							System.out.print("Black ");
							score++;
						} else {
							boolean found = false;
							for (int j = 0; j < 4; j++) {
								if (guess[o] == code[j] && o != j) { // Check if guess[o] is in the code but not in the
																		// correct position
									System.out.print("White ");
									found = true;
									break; // Break the inner loop
								}
							}
							if (!found) {
								System.out.print("- ");
							}
						}
					}
					System.out.println();

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
				attempts -= 1;
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
