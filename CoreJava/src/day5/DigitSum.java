package day5;

import java.util.Scanner;

public class DigitSum
{
	
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		long num = obj.nextLong();
		int sum = 0;
		
		while(num != 0)
		{
			long ld = num % 10;
			sum += ld;
			num /= 10;
		}
		System.out.println(sum);
		
		obj.close();
		
		
	}

}
