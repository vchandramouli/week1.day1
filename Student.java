package week1.day1;

public class Student {
	String name = "Chandru";
	int rollno = 23;
	public static void main(String[] args) {
		Student object = new Student();
		object.printCollege();
		String output = object.Section();
		System.out.println(output);
		object.FloorNo("Floor no:" + "Ground Floor");
		String name = object.name;
		System.out.println("Name:" + name);
		int rollno = object.rollno;
		System.out.println("Roll Number:" + rollno);
	}
	public void printCollege(){
		System.out.println("Collge name:" + "PSNA CET");
	}
	private String Section() {
		String Section = "Section:" + "A";
		return(Section);
	}
	void FloorNo(String name) {
		System.out.println(name);
	}
}

