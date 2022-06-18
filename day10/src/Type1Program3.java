import java.util.Scanner;

public class Type1Program3 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the row the value");
	int n= sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		char ch ='A';//extra variable intitialization inside the outer for loop to retain the initial value in everyrow
				for(int j=1;j<=i;j++)
					System.out.println(ch++);//A
				System.out.println();
	}
	
}
}
