package week2Day2;

public class SwappingNumbersWithoutTemp {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		System.out.println("Before swapping the value of a =" + a);
		System.out.println("Before swapping the value of b =" + b);

		b = b - a;
		a = a + b;

		System.out.println("*******************************");

		System.out.println("After swapping the value of a =" + a);
		System.out.println("After swapping the value of b =" + b);

	}

}
