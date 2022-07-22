package march9;
/*The total number of students in a class are 90 out of which 45 are boys. 
 * If 50% of the total students secured grade 'A' out of which 20 are boys, 
 * then write a program to calculate the total number of girls getting grade 'A'.
 */

public class grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=90;
		int boys=45;
		int girls=no-boys;
		int gradeA=(50*90)/100;
		int boysA=20;
		int girlsA=gradeA-boysA;
		System.out.println("No of girls getting grade A"+girlsA);

	}

}
