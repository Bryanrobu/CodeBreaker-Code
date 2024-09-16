package masterMind;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Codebreaker {

    public static void main(String[] args) {
        // Code colors/numbers
        String[] colors = {"R", "G", "B", "Y", "O", "P"}; // Red, Green, Blue, Yellow, Orange, Purple
        int codeLength = 4;
        int maxAttempts = 10;
        
        // Generate secret code
        String[] secretCode = generateSecretCode(colors, codeLength);
        
        System.out.println("Welcome to Codebreaker!");
        System.out.println("Try to guess the secret code made of the following colors:");
        System.out.println(Arrays.toString(colors));
        
        Scanner scanner = new Scanner(System.in);
        boolean codeGuessed = false;

        // Give the player a limited number of attempts
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.print("Attempt " + attempt + ": Enter your guess (e.g., RGBY): ");
            String guess = scanner.nextLine().toUpperCase();

            if (guess.length() != codeLength) {
                System.out.println("Invalid guess. Please enter " + codeLength + " colors.");
                attempt--; // Do not count invalid attempts
                continue;
            }

            // Provide feedback
            int[] feedback = getFeedback(secretCode, guess.split(""));
            System.out.println("Correct colors in the correct position: " + feedback[0]);
            System.out.println("Correct colors in the wrong position: " + feedback[1]);

            // Check if the guess is correct
            if (feedback[0] == codeLength) {
                codeGuessed = true;
                break;
            }
        }

        // End of game
        if (codeGuessed) {
            System.out.println("Congratulations! You've guessed the code!");
        } else {
            System.out.println("Sorry! You've run out of attempts. The secret code was: " + Arrays.toString(secretCode));
        }

        scanner.close();
    }

    // Method to generate a random secret code
    private static String[] generateSecretCode(String[] colors, int length) {
        Random random = new Random();
        String[] code = new String[length];

        for (int i = 0; i < length; i++) {
            code[i] = colors[random.nextInt(colors.length)];
        }

        return code;
    }

    // Method to provide feedback on the guess
    private static int[] getFeedback(String[] secretCode, String[] guess) {
        int correctPosition = 0;
        int correctColor = 0;
        boolean[] secretChecked = new boolean[secretCode.length];
        boolean[] guessChecked = new boolean[guess.length];

        // First pass: Check for correct position
        for (int i = 0; i < secretCode.length; i++) {
            if (secretCode[i].equals(guess[i])) {
                correctPosition++;
                secretChecked[i] = true;
                guessChecked[i] = true;
            }
        }

        // Second pass: Check for correct colors in wrong position
        for (int i = 0; i < secretCode.length; i++) {
            for (int j = 0; j < guess.length; j++) {
                if (!secretChecked[i] && !guessChecked[j] && secretCode[i].equals(guess[j])) {
                    correctColor++;
                    secretChecked[i] = true;
                    guessChecked[j] = true;
                    break;
                }
            }
        }

        return new int[]{correctPosition, correctColor};
    }
}