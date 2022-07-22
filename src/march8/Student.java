package march8;

/*Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the
value of roll_no as '2' and that of name as "John" by creating an object of the class Student*/


public class Student {
	 String name;
	 int rollno;
}
class object1{
	public static void main(String[] args)
	{
		Student s=new Student();
		s.name="John";
		s.rollno=2;
		System.out.println("Name is"+s.name+"and rollno is "+s.rollno);
		
	}

}
