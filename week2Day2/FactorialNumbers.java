package week2Day2;

public class FactorialNumbers {

	public static void main(String[] args) {
		int num = 5;

		int fact = 1;
		for (int i = num; i >= 1; i--) {
			fact = fact * i;
		}

		System.out.println("The Factorial number of " + num + ":" + fact);

	}

}
