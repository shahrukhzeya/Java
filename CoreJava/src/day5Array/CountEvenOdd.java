package day5Array;

import java.util.Scanner;

public class CountEvenOdd {

	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		
		long num = obj.nextLong();
		int even = 0;
		int odd = 0;
		
		while(num != 0)
		{
			long ld = num % 10;
			if(ld % 2 == 0) even++;
			else odd++;
			num /=10;
		}
		System.out.println(even +" even and " +odd +" odd");
		
		obj.close();

	}

}
