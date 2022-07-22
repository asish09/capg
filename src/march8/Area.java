package march8;


/*. Write a program to print the area of a rectangle by creating a class named 'Area' having two
methods. First method named as 'setDim' takes length and breadth of rectangle as parameters and the
second method named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle
are entered through keyboard.*/


import java.util.Scanner;

public class Area {
	private double length;
	private double breadth;
	
	public void setDim(double len,double bre)
	{
		this.length=len;
		this.breadth=bre;
	}
	public double getArea()
	{
		return this.breadth * this.length;
	}
	public static void main(String[] args)
	{
		Area areaObj= new Area();
		System.out.println("Enter the breadth and length");
		Scanner sc=new Scanner(System.in);
		double len=sc.nextDouble();
		double bre=sc.nextDouble();
		areaObj.setDim(len, bre);
		System.out.println("Area"+areaObj.getArea());
	}

}
