package march10;

import java.util.Scanner;

public class greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three no.");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if((a>b)&&(a>c))
			System.out.println("the greater no is "+a);
		else if ((b>a)&&(b>c))
			System.out.println("the greater no. is "+b);
		else 
			System.out.println("the greater no. is "+c);
		

	}

}
