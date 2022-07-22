package march9;
/*Write a program to add 8 to the number 2345 and then divide it by 3. Now, the modulus of the quotient is taken with 5 and 
then multiply the resultant value by 5. Display the final result.*/
public class addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2345;
		int b,c,d,e;
		b=a+8;
		c=b/3;
		d=c%5;
		e=d*5;
		System.out.println("final result"+e);

	}

}
