package logical;

public class AndOperator {
	public static void main(String args[]) {
		int a = 80;
		int b = 77;
		if ((a > b) && (b < a)) // >-greaterthan ,<-lessthan
		{
			System.out.println("a is greater than b assume true");
		} else {
			System.out.println("a is lesthan b assume false");
		}
	}
}
