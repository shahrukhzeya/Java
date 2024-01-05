class Mobile
{
	String brand;
	int price;
	
	static String type; // This is a common for all object
	
	public void Show() {
		System.out.println(type + ": "+ brand +": "+ price);
	}
}


public class StaticVar {

	public static void main(String[] args) {
		
		
		Mobile mb = new Mobile();
		Mobile mb2 = new Mobile();
		
		mb.brand = "Nokia";
		mb.price = 20000;
		
		Mobile.type = "SmartPhone";
		
		mb2.brand = "RealMe";
		mb2.price = 15000;
		
		
		mb.Show();
		mb2.Show();
		
		
		

	}

}
