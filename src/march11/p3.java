package march11;
import java.util.Scanner;
public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=true;
		int [] marks=new int[3];
		marks[0]=7;
		marks[1]=56;
		marks[2]=6;
		Scanner sc=new Scanner(System.in);
		int index;
		int i=0;
		while(flag && i<5)
		{
			try {
				System.out.println("enter the value of index");
				index=sc.nextInt();
				System.out.println("the value of marks[index] is"+marks[index]);
				break;
			}
			catch(Exception e)
			{
				System.out.println("invalid index");
				i++;
			}
		}
		if(i>=5)
		{
			System.out.println("Error");
		}
		
	}}
