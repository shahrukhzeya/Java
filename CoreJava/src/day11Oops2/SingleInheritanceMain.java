package day11Oops2;

public class SingleInheritanceMain {
	public static void main(String[] args) {
		B objb = new B();
		C objc = new C();
		
		System.out.println(objc.d);
		System.out.println("i'm not getting any benefits of copilot");
		objc.printC();
		
		System.out.println(objb.a);
		System.out.println(objb.b);
		
		objb.printA();
		objb.printB();
		
		
		

	}

}
