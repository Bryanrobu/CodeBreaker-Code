
package masterMind;

import java.util.Scanner;


public class SquareRootWhile {
    public static void main(String args[])
    {
    System.out.print("Type a non-negative integer: (-1 om te stoppen) \n");
     Scanner console = new Scanner(System.in);
	int number = console.nextInt();
	int som = 0;
	while(number !=-1) { 
		som = som + number;
		System.out.print("Type a non-negative integer: (-1 om te stoppen) \n");
		number = console.nextInt(); }
		
		System.out.println("Sum= " + som);
		
		console.close();
	
	
    
}
    
}
