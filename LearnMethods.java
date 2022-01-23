package week1.day1;

public class LearnMethods {
	int number = 54; // global variable or class level variable
	public static void main(String[] args) {
		System.out.println("Hello World");
		// create an object for a class
		// className objectName = new className;
		LearnMethods object = new LearnMethods();
		// syntax to call method name: object.methodName();
		object.printName();
		object.printGivenName("Sid");
		int output = object.GetCreditCardPin(); // ctrl+2 -> l
		System.out.println(output);
		int num = object.number;
		System.out.println(num);
	}
	
	public void printName() {
		System.out.println("Chandru");
	}
	private int GetCreditCardPin() {
		int pin = 9898;
		return pin;
	}
	void printGivenName(String name) {
		System.out.println(name);
	}
}
