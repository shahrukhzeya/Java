package day5;

import java.util.Scanner;

public class Palindrome {
	public static boolean isPalindrome(int a) {
		int originalNum = a;
		int reverse = 0;
		while(a != 0)
		{
			int ld = a % 10;
			reverse = reverse * 10 + ld;
			a /= 10;
		}
		
		return reverse == originalNum;
	}
	
	
	public static void main(String s[]) {
		
		Scanner obj = new Scanner(System.in);
		
		int num = obj.nextInt();
		
		if(isPalindrome(num)) {
			System.out.println(num +" is palindrome");
		}
		else
		{
			System.out.println(num + " is not a palindrome");
		}
		
		obj.close();
		
	}

}
