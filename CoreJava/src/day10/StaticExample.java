package day10;

public class StaticExample {
	
	String name;
	int cls;
	static String loc = "Delhi";
	
	void set(String name, int cls)
	{
		this.name = name;
		this.cls = cls;
		
	}
	
	void show()
	{
		System.out.println(name);
		System.out.println(cls);
		System.out.println(loc);
	}

	/*
	public static void main(String[] args) {
		
		StaticExample se1 = new StaticExample();
		StaticExample se2 = new StaticExample();
		StaticExample se3 = new StaticExample();
		StaticExample se4 = new StaticExample();
		
		se1.set("Atif", 7);
		se2.set("Inayat", 7);
		se3.set("Akif", 5);
		se4.set("Atik", 1);
		
		se1.show();
		System.out.println("---------------------");
		se2.show();
		System.out.println("---------------------");
		se3.show();
		System.out.println("---------------------");
		se4.show();
		
		
	*/

	}

