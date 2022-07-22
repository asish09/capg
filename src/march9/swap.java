package march9;
/*Suppose the values of variables 'a' and 'b' are 6 and 8 respecrtively, write two programs to swap the values of the two variables.
	i - first program by using a third variable
	ii - second program without using any third variable
	( Swapping means interchanging the values of the two variables E.g.- 
	If entered value of x is 5 and y is 10 then after swapping the value of x and y should become 10 and 5 respectively.)*/


public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=6;
		int b=8;
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("after swapping "+a+" "+b);

	}

}
