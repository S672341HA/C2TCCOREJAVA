
public class ContinueWhileloop {
public static void main(String[]args) {
	int i =1;
	while(i<=10) {//1<==10 6<=10
		if(i==5) {//5==5
			i++;//6
			continue;
		}
		System.out.println(i);//12346...10
		i++;//235
		}
	}
}

