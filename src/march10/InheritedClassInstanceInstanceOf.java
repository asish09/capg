package march10;
class Animal{}
class Mammal extends Animal{}
class InheritedClassInstanceInstanceOf {
	public static void main(String[] args)
	{
		Mammal mobj=new Mammal();
		Animal aobj=new Animal();
		
		if (mobj instanceof Mammal)
			System.out.println("mobj is instance of Mammal");
		else 
			System.out.println("mobj is not instance of Mammal");
		
		if (mobj instanceof Animal)
			System.out.println("mobj is instance of Animal");
		else 
			System.out.println("mobj is not instance of Animal");
		if(aobj instanceof Mammal)
			System.out.println("aobj is instance oF Animal");
		else
			System.out.println("aobj is not imstance of Animal");
		
		}
}


