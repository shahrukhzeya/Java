package day4Condition;

import java.util.Scanner;

public class SmallestOf3 {
	public static void main(String args[]) {
		
		Scanner obj = new Scanner(System.in);
		
		int a = obj.nextInt();
		int b = obj.nextInt();
		int c = obj.nextInt();
		
		if(a>=b && a>=c) {
			System.out.println(a + " is the greatest");
		}
		else if(b >= a && b >= c) System.out.println(b + " is the greatest");
		else
			System.out.println(c + " is the greatest");
	}

}
