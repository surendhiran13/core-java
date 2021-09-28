package typeCasting;

public class NarrowingCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// syntax----> old data current data =variable name
		double myDouble = 9.845678789098665432456787998765;
		float myFloat = (float) myDouble;
		// double to float implementation
		float mFloat = 8.899898f;
		long myLong = (long) mFloat;
		// float to long implementation
		long mlong = 112l;
		int myInt = (int) mlong;
		// long to int implementation
		int mint = 12;
		char myChar = (char) mint;
		// int to char implementation
		char mChar = 'a';
		short myShort = (short) mChar;
		// char to short implementation
		short mshort = -26789;
		byte myByte = (byte) mshort;// short to byte implementation
		System.out.println("double value:"+myDouble);
		System.out.println("convert to float value:"+myFloat);
		System.out.println("float value:"+mFloat);
		System.out.println("convert to long value:"+myLong);
		System.out.println("long value:"+mlong);
		System.out.println("convert to int value:"+ myInt);
		System.out.println("int value:"+mint);
		System.out.println("convert to char value:"+myChar);
		System.out.println("char value:"+mChar);
		System.out.println("convert to short value:"+myShort);
		System.out.println("short value:"+mshort);
		System.out.println("convert to byte value:"+myByte);
	}

}
