package march8;

public class Member {
	    private String name;
	    private int age;
	    private String phoneNumber;
	    private String address;
	    private double salary;
	    
	    public Member()
	    {
	    	name="Sai";
	    	age=21;
	    	phoneNumber="12345678";
	    	address="jagannath colony";
	    	salary=234566.0f;
	    }

	    public Member(String name, int age, String phoneNumber, String address, double salary) {
	        this.name = name;
	        this.age = age;
	        this.phoneNumber = phoneNumber;
	        this.address = address;
	        this.salary = salary;
	    }

	    public void printSalary() {
	        System.out.println("Salary " + salary);
	    }

	    public static void main(String[] args) {
	        Member member = new Member();
	        System.out.println("Name"+member.name);
	        System.out.println("Age"+member.age);
	        System.out.println("salary"+member.salary);
	        member.printSalary();
	        System.out.println("********************************************");
	        
	        Member parameterMemberObject=new Member("Rahul",21,"6789054","25 bhiki avenue",35000.0f);
	        System.out.println("name"+parameterMemberObject.name);
	        System.out.println("age"+parameterMemberObject.age);
	        System.out.println("Salary"+parameterMemberObject.salary);
	        parameterMemberObject.printSalary();
	        System.out.println("********************************");
	    }
}