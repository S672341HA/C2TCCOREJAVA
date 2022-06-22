package inheritance;

public class Animal {
void eat()
{
	System.out.println("eating...");
	
}
}
class Dog extends Animal{
	void bark()
	{
		System.out.println("barking...");
		
	}
}
class cat extends Animal{
	void meow()
	{
		System.out.println("meowing...");
	}
}
class TestInhertiance3{
	public static void main(String args[]) {
		Cat c=new Cat();
		c.meow();
		c.eat();
		//C.bark();//C.T.Errror
		
	}
}