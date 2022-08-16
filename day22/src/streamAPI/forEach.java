package streamAPI;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class forEach {

	public static void main(String[] args) {
		 List<Integer> list = Arrays.asList(1,2,3,4,5,6 );
		 //External Iterations
		// for loop
		 for(int i=0;i<6;i++) {
			 System.out.println(list.get(i));
			 
			 //Iterator
			 Iternator itr =list.iterator();
			 while(itr.hasnext()) {
				 System.out.println(itr.next()) ;
				
				 //Enhanced for Loop
				 for(Integer I :list) {
					 System.out.println(I);
					 
					 //Internal Iterations
					 //forEach method
					 list.forEach(values -> System.out.println(values));
					 
				 }
			 }
			 
		 }

	}

}
