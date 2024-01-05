package day10;

public class StaticMain {

	public static void main(String[] args) {
		StaticExample se1 = new StaticExample();
		StaticExample se2 = new StaticExample();
		StaticExample se3 = new StaticExample();
		StaticExample se4 = new StaticExample();
		
		se1.set("Atif", 7);
		se2.set("Inayat", 7);
		se3.set("Akif", 5);
		se4.set("Atik", 1);
		
		StaticExample.loc = "Punjab";
		
		se1.show();
		System.out.println("---------------------");
		se2.show();
		System.out.println("---------------------");
		se3.show();
		System.out.println("---------------------");
		se4.show();
		
		

	}

}
