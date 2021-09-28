package operators;

public class ArithmeticOperatorsProblem {
	public static void main(String[] args) {
		int a = 25, b = 20, c = 30, d = 45;
		int x = a / b;// divide a and b
		int y = c * d;// multiply c and d
		int z = x + y;// addition x and y
		int w = b % c;// modulus b and c
		d++;// increment
		a--;// decrement
		System.out.println(w);
		System.out.println(d++);
		System.out.println(a--);
		System.out.println(x);
		System.out.println(y);
		System.out.print(z);
	}
}
