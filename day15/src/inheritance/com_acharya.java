package inheritance;

public class com_acharya {
	
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

	

}
public class SingleInheritance {
	
	public static void main(String[] args) {
		Dog d = new Dog();
		Animal a1 = new Animal();
		Animal a = new Dog();
		Dog d1 = new Animal();
		d.bark();
		d.eat();
		
	}
}
