
package chickens01;

import java.util.Scanner;

public class Chickens01 {
    public static void main(String[] args) {
        //Put yout code here
    	Scanner sc = new Scanner (System.in);
    	
    	System.out.println("How many eggs does one chicken lay per day?");
    	int eggsPerChicken = sc.nextInt();
    	System.out.println("How many chickens do you have");
    	int chickenCount = sc.nextInt();
    	int totalEggs = 0;
    	
        //dag 1:
    		totalEggs = eggsPerChicken * chickenCount;
    		
    	//dag 2:
    		chickenCount = chickenCount + 1;
    		totalEggs = totalEggs + chickenCount * eggsPerChicken;
    		
    	//dag 3:
    		chickenCount /=2;
    		totalEggs = totalEggs + chickenCount * eggsPerChicken;
    	
    		sc.close();
    		
        System.out.println(totalEggs);
    }   
}
