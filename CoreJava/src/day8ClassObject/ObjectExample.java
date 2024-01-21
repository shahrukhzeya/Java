package day8ClassObject;

class ObjectExample {
	static int price = 20000;
	String color;
	double speed;
	String bname;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectExample oe = new ObjectExample();
		
		oe.bname = "BMW";
		oe.speed = 120.53;
		oe.color = "Black";
		
		
		System.out.println(price);
		System.out.println(oe.bname);
		System.out.println(oe.speed);
		System.out.println(oe.color);
		

	}

}
