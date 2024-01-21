package day6Loop;

import java.util.Scanner;

public class SumOfArray 
{
	public static void main(String args[])
	{
//		Method 1
//		int arr[]= {1,2,3,4,5};
//		int sum = 0;
//		for(int i: arr)
//		{
//			sum += i;
//		}
//		System.out.println(sum);
		
//		Method 2
		
		int sum = 0;
		int arr[]=new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i= 0; i<5; i++)
		{
			arr[i]= sc.nextInt();
		}
		
		for(int i : arr)
		{
			sum += i;
		}
		
		System.out.println("Sum Of Array is : "+ sum);
		
		for(int i : arr)
		{
			System.out.println(i);
		}
		
		sc.close();
		
		
	}

}
