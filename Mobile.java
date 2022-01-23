package week1.day1;

public class Mobile {
	public static void main(String[] args) {
		Mobile object = new Mobile();
		object.sendmsg();
		object.makecall();
		object.savecontact();
	}

	private void sendmsg() {
		System.out.println("How are you?");
	}
	private void makecall() {
		System.out.println("Call Sid");
	}
	private void savecontact() {
		System.out.println("save contact mohan");
	}
}
