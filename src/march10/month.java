package march10;
import java.util.Scanner;
public class month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean ly=false;
		System.out.println("Enter the month and year");
		int m=sc.nextInt();
		double y=sc.nextDouble();
		if(y%4==0)
		{
			if(y%100==0) {
				if(y%400==0)
					ly=true;
				else 
					ly=false;
						
			}
		}
		if((m==1)||(m==3)||(m==5)||(m==7)||(m==8)||(m==10)||(m==12))
		{
			System.out.println("31");
		}
		else if((m==2)&&(ly==false))
		{
			System.out.println("28");
		}
		else if((m==2)&&(ly==true))
		{
			System.out.println("29");
		}
		else
			System.out.println("30");
		
		
		

	}

}
