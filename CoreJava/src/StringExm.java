
public class StringExm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Shahrukh";
		System.out.println(str);
		System.out.println(str.concat(" Zeya"));
		
		
		String s1 = "Farhan";
		String s2 = "Farhan";
		System.out.println(s1 == s2);
		
		/*
		 * String Types : StringBuffer and StringBuiler
		 * StringBuffer : Mutable type - It will give 16 capacity of empty string
		 * StringBuilder : Immutable type
		 * 
		 * 
		 */
		StringBuffer sb = new StringBuffer("Atif Reyaz");
		sb.append(" Shaikh");
		
		System.out.println(sb);
		System.out.println(sb.capacity());

	}

}
