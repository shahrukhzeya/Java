package day13WrapperClass;

public class WraperClass {

	public static void main(String[] args) {
		int primitiveInt = 10;
        double primitiveDouble = 3.14;
        char primitiveChar = 'A';
        boolean primitiveBoolean = true;

        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Primitive double: " + primitiveDouble);
        System.out.println("Primitive char: " + primitiveChar);
        System.out.println("Primitive boolean: " + primitiveBoolean);

        // Using wrapper classes
        Integer wrappedInt = Integer.valueOf(primitiveInt);
        Double wrappedDouble = Double.valueOf(primitiveDouble);
        Character wrappedChar = Character.valueOf(primitiveChar);
        Boolean wrappedBoolean = Boolean.valueOf(primitiveBoolean);

        System.out.println("\nWrapper Integer: " + wrappedInt);
        System.out.println("Wrapper Double: " + wrappedDouble);
        System.out.println("Wrapper Character: " + wrappedChar);
        System.out.println("Wrapper Boolean: " + wrappedBoolean);

        // Auto-boxing and auto-unboxing
        Integer autoBoxedInt = primitiveInt; // Auto-boxing
        int autoUnboxedInt = wrappedInt;    // Auto-unboxing

        System.out.println("\nAuto-boxed Integer: " + autoBoxedInt);
        System.out.println("Auto-unboxed int: " + autoUnboxedInt);
		



	}

}
