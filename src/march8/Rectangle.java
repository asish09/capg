package march8;

public class Rectangle {
	private int length;
	private int breadth;
	
	public Rectangle() {
		length=25;
		breadth=9;
	}
	public Rectangle(int length, int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	public int printArea()
	{
		int area=length*breadth;
		return area;
	}
	public int printPerimeter()
	{
		int perimeter=2*(length+breadth);
		return perimeter;
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec=new Rectangle();
		System.out.println("Area of the Rectangle is"+rec.printArea());
		System.out.println("Perimeter is"+rec.printPerimeter());

	}

}
