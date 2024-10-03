package masterMind;

import java.util.*;
import java.util.Random;

public class MasterMind {

	public static void main(String[] args) {

		Random rand = new Random();

		int attempts = 0;
		boolean gameWon = false;

		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("[\\s,]+");

		int code1 = rand.nextInt(7);
		int code2 = rand.nextInt(7);
		int code3 = rand.nextInt(7);
		int code4 = rand.nextInt(7);

		int score = 0;

		// Main Game Loop
		while (attempts < 10) {
			System.out.println("Numbers: 0-7");
			System.out.println("Attempt " + (attempts += 1) + ": Enter your guess: (example: 1 2 3 4) ");

			int guess1 = sc.nextInt();
			int guess2 = sc.nextInt();
			int guess3 = sc.nextInt();
			int guess4 = sc.nextInt();

			if (guess1 == code1) {
				System.out.print("Black ");
				score = score + 1;
			} else if (guess1 == code2) {
				System.out.print("White ");
			} else if (guess1 == code3) {
				System.out.print("White ");
			} else if (guess1 == code4) {
				System.out.print("White ");
			} else {
				System.out.print("- ");
			}

			if (guess2 == code2) {
				System.out.print("Black ");
				score = score + 1;
			} else if (guess2 == code1) {
				System.out.print("White ");
			} else if (guess2 == code3) {
				System.out.print("White ");
			} else if (guess2 == code4) {
				System.out.print("White ");
			} else {
				System.out.print("- ");
			}

			if (guess3 == code3) {
				System.out.print("Black ");
				score = score + 1;
			} else if (guess3 == code1) {
				System.out.print("White ");
			} else if (guess3 == code2) {
				System.out.print("White ");
			} else if (guess3 == code4) {
				System.out.print("White ");
			} else {
				System.out.print("- ");
			}

			if (guess4 == code4) {
				System.out.println("Black ");
				score = score + 1;
			} else if (guess4 == code1) {
				System.out.println("White ");
			} else if (guess4 == code2) {
				System.out.println("White ");
			} else if (guess4 == code3) {
				System.out.println("White ");
			} else {
				System.out.println("- ");
			}

			if (score == 4) {
				attempts = 10;
			} else {
				score = 0;
			}
		}
		if (score == 4) {
			System.out.println("You have won! good job :D");
		} else {
			System.out.println("You have sadly lost, better luck next time! The code was: " + code1 + "." + code2 + "."
					+ code3 + "." + code4);
		}
	}
}
