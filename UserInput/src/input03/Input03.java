package input03;

import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        // Create a Scanner
        Scanner sc = new Scanner(System.in);
        
        try {
            // Prompt user for birth year
            System.out.print("Enter your birth year: ");
            int birthYear = sc.nextInt();
            
            // Calculate age
            int currentYear = 2024;
            int age = currentYear - birthYear;
            
            // Print the age
            System.out.println("Your age is: " + (age - 1) + " or " + age );
        } catch (Exception e) {
            System.out.println("Please enter a valid year.");
        } finally {
            // Remember to close the Scanner
            sc.close();
        }
    }
}