package day7String;

public class ReverseString {
	String str = "Shahrukh";
	String temp = "";
	
	int n = str.length();
	void rev()
	{
		
		for(int i=n-1; i>=0; i--)
		{
			temp +=str.charAt(i);
		}
		System.out.println(temp);
	}
	

	public static void main(String[] args) {
		
		ReverseString rs = new ReverseString();
		rs.rev();
		
	}

}
