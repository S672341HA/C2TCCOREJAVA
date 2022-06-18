
public class BreakDoWhile {
	public static void main(String[] args) {
		int i=1;
		do {
			if(i==5) {//2==5,3==5 4==5 5==5
				i++;//6
				break;
			}
			System.out.println(i);//1234
			i++;//2345
		}while(i<=10);//2<=10,3<=10,4<=10,5<=10
		System.out.println(i);
		
			}
		}
	


