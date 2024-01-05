
public class Array {

	public static void main(String[] args) {
		
		int nums[][] = new int [4][3];
		
		int ran =(int) Math.random()*100;
		
//		Inserting the value into array
		
		for(int i = 0; i<4; i++)
		{
			for(int j = 0; j<3; j++)
			{
				nums[i][j]= (int)(Math.random()*10);
//				System.out.println(nums[i][j]);
			}
		}
		
		
		System.out.println("printing the 2d array using for loop");
		
		for(int i = 0; i<4; i++)
		{
			for(int j = 0; j<3; j++)
			{
				System.out.print(nums[i][j] +" ");
			}
			System.out.println();
		}

		
//		Printing 2d array using for each loop
		System.out.println("printing the 2d array using for each loop");
		
	for(int i[]:nums)
	{
		for(int m: i) {
			System.out.print(m + " ");
			
		}
		System.out.println();
	}
	
	
	
	}

}
