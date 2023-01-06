package collections;

public class Employee {

	public static void main(String[] args) {
		EmployeeDoB pine = new EmployeeDoB(1992, 02, 26);
		EmployeeDetails oran = new EmployeeDetails("ashok", pine);
		System.out.println(oran);

	}
}
