package march8;

import java.util.Scanner;

public class Rectang {
	int length;
	int breadth;
	public Rectang (int l,int b)
	{
		length=l;
		breadth=b;
	}
	public int returnArea()
	{
		return length*breadth;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int l,b;
		System.out.println("Enter length");
		l=sc.nextInt();
		System.out.println("Enter breadth");
		b=sc.nextInt();
		Rectang a = new Rectang(l,b);
		System.out.println("Area"+a.returnArea());

	}

}
