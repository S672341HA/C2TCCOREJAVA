
public class company {
	
	
	private String[] name;

	public static void main(String[] args) {
		company c = new company();
		company c1 = c;
		c1.name = "C2TC";
		c = null;
		System.out.println(c.name);
		
		
		
		
	}

}
