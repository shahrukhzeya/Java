package day11;

public class RBIMain {

	public static void main(String[] args) {
		IDFC idfc = new IDFC();
		KOTAK kot = new KOTAK();
		
		System.out.println(idfc.minInt);
		idfc.printRBI();
		
		System.out.println("Accessing content from KOTAK class");

		System.out.println(kot.maxInt);
		kot.printRBI(4);
	}

}
