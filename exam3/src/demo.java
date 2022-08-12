
public class demo {
	int x;
}
class testdemo{
	
	public static void main (String[] args) {
		demo myobj1 = new demo();
		demo myobj2 = new demo();
		demo myobj3 = new demo();
		myobj1.x = 24;
		myobj1.x = 55;
		myobj1.x = 65;
		System .out.println(myobj1.x);
		System .out.println(myobj2.x);
		System .out.println(myobj3.x); 
	}
}
 