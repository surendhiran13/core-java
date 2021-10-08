package logical;

public class OrOperator {

	public static void main(String[] args) {
		int a = 30;
		int b = 16;
		if ((a < b) || (b>a)) //using if statement on logical operators
		{
			System.out.println("eligible for vote");
		} else {
			System.out.println("not eligible for vote");
		}
	}
}
