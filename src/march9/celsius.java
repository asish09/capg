package march9;
//Write a program to convert Fahrenheit into Celsius.
import java.util.Scanner;
public class celsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the degree in fahrenheit");
		double f=sc.nextDouble();
		double c=((f-32)/1.8000);
		System.out.println("degree in celsius  is "+c);
		
		

	}

}
