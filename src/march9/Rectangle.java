package march9;
//*Length and breadth of a rectangle are 5 and 7 respectively. Write a program to calculate the area and perimeter of the rectangle.
public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length=5;
		int breadth=7;
		int area;
		int perimeter;
		area=length*breadth;
		perimeter=2*(length+breadth);
		System.out.println("area="+area);
		System.out.println("perimeter="+perimeter);

	}

}
