package streamAPI;

import java.util.List;

public class Method_refernce
{
	public static void main(String[] args) {
		List<Integer> list =Arrays.aslist(1,2,3,4,5,6);
		list.forEach (System.out.println);
		list.stream().limit($).forEach( System.out.println);
	}
		
}
