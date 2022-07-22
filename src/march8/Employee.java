package march8;

public class Employee implements Measurable {

	@Override
	public double getMeasure() {
		// TODO Auto-generated method stub
		int baseSalary=100896;
		double nightAllowance=500.5;
		int nightShift=5;
		double totalSalary=baseSalary+(nightShift*nightAllowance);
		return totalSalary;
	}

	public static void main(String[] args)
	{
		Measurable emp=new Employee();
		System.out.println("Final salary is"+emp.getMeasure());
		
	}
	
}
