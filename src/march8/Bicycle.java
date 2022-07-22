package march8;

public class Bicycle implements Vehicle {

	@Override
	public void changeGear() {
		// TODO Auto-generated method stub
		System.out.println("change the gear");
	}

	@Override
	public void speedUp() {
		// TODO Auto-generated method stub
		System.out.println("speed up your vehicle");
		
	}

	@Override
	public void applyBreaks() {
		// TODO Auto-generated method stub
		System.out.println("apply break");
		
	}
	public static void main(String[] args)
	{
		Bicycle b=new Bicycle();
		b.changeGear();
		b.applyBreaks();
		b.speedUp();
		
		
	}

}
