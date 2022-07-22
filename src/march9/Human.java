package march9;

public class Human {
	private String name;
	private int age;
	private String food;
	
	public Human(String name, int age, String food)
	{
		this.name=name;
		this.age=age;
		this.food=food;
		
	}
	public String work()
	{
		return name+" "+age;
	}
	public String eat()
	{
		return name+" "+food;
	}
}
