class Addition
{
	public int add(int a, int b)
	{
		return a+b;
	}
}



public class Literal 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a = 5; 
		int b = 10;
		
		Addition ad = new Addition();
		System.out.println(ad.add(a,b));
	}
}
