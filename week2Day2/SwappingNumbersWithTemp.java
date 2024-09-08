package week2Day2;

public class SwappingNumbersWithTemp {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int tmp;

		System.out.println("Before swapping the value of a =" + a);
		System.out.println("Before swapping the value of b =" + b);

		tmp = a;
		a = b;
		b = tmp;

		System.out.println("*******************************");

		System.out.println("After swapping the value of a =" + a);
		System.out.println("After swapping the value of b =" + b);

	}

}
