package stastic_method;

public class Student {
		int rollno;
		String name;
		float fee;
		static String college ="IIT";
		Student(int r, String n){
			rollno = r;
			name =n;
		}
		
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
		
		public static void main(String[] args) { 
			Student s1 = new Student(111,"Suresh");
		Student s2 = new Student(222,"Rajesh");
		s1.display();
		s2.display();
		

	}

}
