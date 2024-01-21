package day3Operator;

public class OperatorExample {

	public static void main(String[] args) {
//		Arithematic operation : + - * / %
		
//		int a = 10, b = 20;
//		System.out.println("Sum of a and b is : "+ (a+b));
//		System.out.println("Diff of a and b is : "+ (a-b));
//		System.out.println("Multiply of a and b is : "+ (a*b));
//		System.out.println("Div of a and b is : "+ (a/b));
//		System.out.println("Modulo of a and b is : "+ (a%b));
		
//		Relational operation : > < >= <= == !=
//		Boolean : true or false	
	
//		Swap the value of two number
		int a = 10;
		int b = 20;
//		Method 1 : with the help of extra variable
//		System.out.println(a +" "+ b);
//		int temp;
//		temp = a;
//		a = b;
//		b = temp;
//		System.out.println(a +" "+ b);
		
//		Method 2 : With the help of operator
		System.out.println(a +" "+ b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println(a +" "+ b);
		
//		Method 3 :
//		System.out.println(a +" "+ b);
//		b = a+b - (a=b);
//		System.out.println(a +" "+ b);

	}

}
