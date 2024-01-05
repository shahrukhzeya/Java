package day6;

import java.util.Scanner;

public class SearchElement {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		int element = sc.nextInt();
		
		for(int i = 0 ; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i: arr)
		{
			if(i == element)
				System.out.println("Element found");
		}
		System.out.println("Element not found");
		
		sc.close();
	}

}
