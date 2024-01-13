package day12;

interface InterfaceEx {
	int a = 20;
	void m(); // abstract method
	default void show()
	{
		System.out.println("Printing from interface");
	}

}

interface Fgh
{
	int b = 30;
	void m1();
	default void show2()
	{
		System.out.println("Printing from 2nd interface");
	}
}




