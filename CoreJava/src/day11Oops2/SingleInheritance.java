package day11Oops2;
/*
 *This is the example of single inheritance 
 * class B inheriting the properties(variable) and behavior(method) from class A
 */

class A
{
	int a = 20;
	
	void printA()
	{
		System.out.println("Inside class A :"+ a);
		
	}
}
class B extends A
{
	int b = 30;
	void printB()
	{
		System.out.println("Inside class B :"+b);
		System.out.println("Inside B after installing copilot");
		
	}
}
/*
 * now it become hierarchy inheritance because class B and class C are inheriting class A
 */
class C extends A
{
	int d = 35;
	void printC()
	{
		System.out.println("Inside class C :"+d);
	}
}

//public class SingleInheritance {
//	
//}
