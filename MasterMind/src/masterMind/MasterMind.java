package masterMind;

import java.util.*;

public class MasterMind {
    
	public static void main(String[] args) {
		
		final int MAX_ATTEMPTS = 10;
	    int attempts = 0;
	    boolean gameWon = false;
		
		Scanner sc = new Scanner(System.in);
		
		//Main Game Loop
		while (attempts < MAX_ATTEMPTS && !gameWon) {
			System.out.println("Attempt " + (attempts +=1) + ": Enter your guess: ");
			String guess = sc.nextLine();
		}
		
		if (!gameWon) {
			System.out.println("You failed. Try again later.");
		}
	}

}