package march10;
import java.util.Scanner;

public class largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,max;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. of elements");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the elements of the array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		max=a[0];
		for(int i=0;i<n;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("max number is"+max);

	}

}
