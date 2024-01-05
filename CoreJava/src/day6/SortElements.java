package day6;

import java.util.Arrays;
import java.util.Scanner;

public class SortElements {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		
		int arr[] = new int [5];
		for(int i = 0; i<5;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		
		System.out.println("Arrays before sorting " + Arrays.toString(arr));
		
//		Arrays.parallelSort(arr);
		Arrays.sort(arr);
		System.out.println("Arrays after sorting " + Arrays.toString(arr));
		
		sc.close();
	}

}
