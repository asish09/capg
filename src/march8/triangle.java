package march8;

public class triangle {
	int a,b,c;
	public double getArea()
	{
		double s=(a+b+c)/2.0;
		return Math.pow((s*(s-a)*(s-b)*(s-c)), s);
		
	}
	public double getPerimeter() {
		return (a+b+c)/2.0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		triangle t=new triangle();
		t.a=2;
		t.b=4;
		t.c=6;
		System.out.println(t.getArea());
		System.out.println(t.getPerimeter());

	}

}
