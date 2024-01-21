package day11Oops2;

/* This is the example of hierarchy inheritance
 * here we are using the concept of overriding
 * in class RBI the value of minInt is 3 overriding value in IDFC class with 4
 * I'm using method overriding concept also in printRBI method in IDFC class
 * Using super keyword to access the immediate parent value from child class
 * In kotak class we are using method overloading concept
 * 
 */

public class RBI {
	double minInt = 3;
	void printRBI()
	{
		System.out.println("Minimum interest rate is : " + minInt);
	}

}

class IDFC extends RBI
{
	double minInt = 4;
	void printRBI()
	{
		System.out.println("Minimum interest rate is : " + super.minInt);
		System.out.println("Here we are using method overriding concept");
		
	}
}
class KOTAK extends RBI
{
	double maxInt = 9;
	void printRBI(double a)
	{
		System.out.println("Minimum interest rate is : " +(maxInt-a));
	}
}
