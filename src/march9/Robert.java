package march9;
//If the marks of Robert in three subjects are 78,45 and 62 respectively (each out of 100 ), write a program to calculate his total marks and percentage marks.

public class Robert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sub1=78;
		int sub2=45;
		int sub3=62;
		int total;
		double percentage;
		total=sub1+sub2+sub3;
		percentage=total/3;
		System.out.println("total marks  "+total);
		System.out.println("percentage  "+percentage);

	}

}
