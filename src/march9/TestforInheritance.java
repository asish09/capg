package march9;

public class TestforInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee("Asish", 22, "7008129039", "J-colony", 40000.0,"Technical");
        Manager manager = new Manager("Jinu", 30, "9437704894", "A-colony", 69000.0, "Testing");
        employee.printSalary();
        manager.printSalary();
    

	}

}
