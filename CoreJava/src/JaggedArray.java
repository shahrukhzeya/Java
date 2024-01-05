
public class JaggedArray {

	public static void main(String[] args) {
		int ar [][] = new int[3][];
		
		ar[0] = new int[3];
		ar[1] = new int[4];
		ar[2] = new int[2];
		
		for(int i =0; i<ar.length; i++)
		{
			for(int j =0; j<ar[i].length; j++)
			{
				ar[i][j] = (int) (Math.random()*10);
			}
		}
		
//		Printing array
		
		for(int i[]: ar)
		{
			for(int j: i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
