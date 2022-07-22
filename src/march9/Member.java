package march9;
/*Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 
'Manager' classes have data members 'specialization' and 'department' respectively. 
Now, assign name, age, phone number, address and salary to an employee and a manager by 
making an object of both of these classes and print the same.*/

public class Member {
	private String name;
	private int age;
	private String phoneNumber;
	private String address;
	private double salary;
	
	public Member(String name,int age, String phoneNumber,String address, double salary)
	{
		this.name=name;
		this.age=age;
		this.phoneNumber=phoneNumber;
		this.address=address;
		this.salary=salary;
	}
	public void printSalary() {
		System.out.println("salary"+salary);
	}

}
