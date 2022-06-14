package acess_modifier_demo;

public class Test1 {
protected int i=10;
protected void show() {
 System.out.println("HELLO WORLD");
}
public static void main (String[] args) {
	Test1 T1= new Test1();
	T1.show();
	System.out.println(T1.i);

	
	
	
}
 
}
