package day12;

public class MultipleInheritance {
	interface ParentA
	{
		String fname = "Reyaz ul Haque";
		void fnamePrint();
		
	}
	interface ParentB
	{
		String mname = "Sagufta Praveen";
		void mnamePrint();
	}
	
	static class X implements ParentA,ParentB
	{
		public void fnamePrint()
		{
			System.out.println("Father name is Reyazul Haque");
		}
		public void mnamePrint()
		{
			System.out.println("Mother name is Sagufta Praveen");
		}
		static void newChild()
		{
			System.out.println("New child name is Ahmad");
		}
	}

	
	public static void main(String[] args) {
		
		X xobj = new X();
		
		System.out.println(xobj.fname);
		xobj.fnamePrint();
		
		System.out.println(xobj.mname);
		xobj.mnamePrint();
		X.newChild();
		
		
		

	}

}
