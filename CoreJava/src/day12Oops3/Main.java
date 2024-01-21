package day12Oops3;

public class Main implements InterfaceEx,Fgh{
	
	
	public void m()
	{
		System.out.println("Printing from class it's a abstract method void m");
	}
	public void m1()
	{
		System.out.println("It's void m1 method abstract method implementation");
	}

	public static void main(String[] args) {
		Main ac = new Main();
		InterfaceEx df = new Main();
		
		System.out.println(ac.a);
		ac.m();
		ac.show();
		System.out.println(ac.b);
		ac.m1();
		ac.show2();
		Fgh.show3();
		
		System.out.println("------------------------------referance variable of interface Def -------------");
		
		
		df.m();
		df.show();

	}

}
