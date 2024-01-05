package day5;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		
		int num = obj.nextInt();
		int reverse = 0;
		
//		while(num != 0)
//		{
//			int lastDigit = num % 10;
//			System.out.print(lastDigit);
//			num /= 10;
//		}
		
		while(num != 0) {
			int ld = num % 10;
			reverse = reverse * 10 + ld;
			num /= 10;
		}
		System.out.println(reverse);
		obj.close();
	}

}
