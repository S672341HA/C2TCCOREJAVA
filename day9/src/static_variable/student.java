package static_variable;

public class student {
	int rollno;
	String name;
	float fee;
	static String college ="acharya";
	student(int r, String n){
		rollno = r;
		name =n;
	}
	
void display()
{
	System.out.println(rollno+" "+name+" "+college);
}
	
	public static void main(String[] args) { 
		student s1 = new student(111,"Suresh");
	student s2 = new student(222,"Tejas");
	s1.display();
	s2.display();
	
	

	}

}
