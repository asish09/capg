package march10;

import java.util.Scanner;

public class vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int i;
		for(i=0;i<5;i++) {
		System.out.println("Enter a numbers");
		int a=sc.nextInt();
		sum+=a;
		}
		int average=sum/5;
		System.out.println("the sum is"+sum);
		System.out.println("the average is "+average);
		

	}

}
