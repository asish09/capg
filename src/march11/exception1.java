package march11;

public class exception1 {
	public static void main(String[] args)
	{
		try
		{
			int a=666/0;;
			
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("hehe");
		}
		catch (ArithmeticException e)
		{
			System.out.println("haha");
		}
	}

}
