package march8;

public class Rectangl {
	int length;
	int breadth;
	public Rectangl(int l,int b)
	{
		length=l;
		breadth=b;
	}
	public int getArea()
	{
		return length*breadth;
	}
	public int getPerimeter()
	{
		return 2*(length+breadth);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangl a=new Rectangl(4,5);
		Rectangl b=new Rectangl(5,8);
		System.out.println("Area"+a.getArea()+"Perimeter is"+a.getPerimeter());
		System.out.println("Area"+b.getArea()+"Perimeter is"+b.getPerimeter());

	}

}
