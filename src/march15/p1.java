package march15;
import java.util.*;
public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> a=new ArrayList();
		 for(int i=0;i<=5;i++)
		 {
			 a.add(i);
			 
		 }
		 System.out.println(a);
		 for(int i=0;i<=5;i++)
		 {
			 System.out.println(a.get(i));
		 }
		 a.remove(3);
		 a.forEach(x -> System.out.println(x));
	}
}