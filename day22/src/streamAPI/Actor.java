package streamAPI;

	public interface Actor{
		void act();
		void speak();
		default  void comedy() {
			System.out.println("I can make comedy");
			
		

		

	}
public class Hero implements Actor{
	public void act() {
	System.out.println("I can act");
}
public void speak() {

System.out.println("I can speak");
}
		
		public void comedy() {
			System.out.println("I can make people laugh");
			
		}

		
		
}
}
   