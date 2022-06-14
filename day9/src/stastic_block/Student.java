package stastic_block;


public class Student {
int rollno;
String name;
static String college;
static
{
	college ="IIT";
	
}
Student(int r, String n){
	rollno =r;
	name =n;
	
}
static void change() {
	college = "acharya";
	
}
void display() {
	System.out.println(rollno+" "+name+" "+college);
	
}
	public static void main(String[] args) {
		Student s1 = new Student(111,"Arjun");
		Student s2 = new Student(222,"Sagar");
		s1.display();
		s2.display();
		

	}

}
