package streamAPI;
import java.util.Arrays;
import java.util.List;


public class Sum {

	public static void main(String[] args) {
		List <Integer> list =Arrays.asList(1,2,3,4,5,6);
		int result =0;
		for(int i : list) {
			result=result+i*2;
		}
		System.out.println(result);
			
			
		}
		
		 

	}
import java.util.Arrays;
import java.util.List;

public class Sum{
	public static void main(String[] args) {
		List <Integer> list =Arrays.asList(1,2,3,4,5,6);
		System.out.printlnlist.stream().map(i->i*2).reduce(0,(c,e)->(c+e));
		System.out.printlnlist.stream().map(i->i*2).reduce(0,(c,e)-> Integer.sum(c,e)));
		System.out.printlnlist.stream().map(i->i*2).reduce(0,Integer::sum));
		
	}
}




 