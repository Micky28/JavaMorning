import java.util.Scanner;

public class Employee {
	String name;
	int age;
	String department;
	String address;
	double salary;
	String empId;

	public static void main(String[] args) {
		Employee e = new Employee();
		Scanner s = new Scanner(System.in);
		e.name = s.next();

	}

}
