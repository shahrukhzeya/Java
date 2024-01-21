package day5Array;

import java.util.Scanner;

public class CountDigit {
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		
		long num = obj.nextLong();
		long n = 0;
		
		while(num != 0)
		{
			num /= 10;
			n++;
		}
		System.out.println(n +" is the digit count");
		
		obj.close();
	}
	

}
