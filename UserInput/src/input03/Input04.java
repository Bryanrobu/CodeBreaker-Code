package input03;

import java.util.Scanner;

public class Input04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter max 5 nubmers to add up: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		
		System.out.println((a+b+c+d+e));
	}

}
