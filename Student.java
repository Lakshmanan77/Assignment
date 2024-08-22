package week1Day3;

public class Student {
	public void learnJava() {
		System.out.println("learning Java");
	}

	public void writeCode() {
		System.out.println("writing java code");

	}

	public void executeCode() {
		System.out.println("executing java code");

	}

	public static void main(String[] args) {

		Student obj = new Student();
		obj.learnJava();
		obj.writeCode();
		obj.executeCode();

	}
}
