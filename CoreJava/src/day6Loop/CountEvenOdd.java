package day6Loop;

import java.util.Scanner;

public class CountEvenOdd {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int even=0;
		int odd = 0;
		
		int arr[] = new int [6];
		for(int i=0; i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i : arr)
		{
			if(i%2 == 0)
				even ++;
			else
				odd++;
		}
		System.out.println("Even count is : "+even);
		System.out.println("Odd count is : "+odd);
		
		
		sc.close();
	}

}
