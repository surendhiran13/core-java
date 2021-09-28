package typeCasting;

public class WideningCasting {
	public static void main(String[] args) {
		byte var1 = 12;
		short b = var1;
		// byte to short implementation through ascending to descending
		short number = 254;
		char c = (char) number;
		// we can use this way but its not possible in ascending syntax ,and also its
		// not a proper way
		char name = 'a';
		int d = name;
		// char to int implementation
		int num = 10;
		long a = num;
		// int to long implementation
		long numeric = 2345L;
		float e = numeric;
		// long to float implementation
		float num1 = 12.33f;
		double g = num1;
		// float to double implementation
		System.out.println("byte value:" + var1);
		System.out.println("coverted to short:" + b);
		System.out.println("short value:" + number);
		System.out.println("converted to char:" + c);
		System.out.println("char value:" + name);
		System.out.println("converted to int:" + d);
		System.out.println("int value:" + num);
		System.out.println("converted to long:" + a);
		System.out.println("long value:" + numeric);
		System.out.println("converted to float:" + e);
		System.out.println("float value:" + num1);
		System.out.println("converted to double:" + g);
	}
}
