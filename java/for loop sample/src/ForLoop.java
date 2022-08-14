import java.util.Scanner;

public class ForLoop {
	public static void main(String arg[]) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the limit");
		int num=sc.nextInt();
		int sum=0;
		for(int i=0;i<=num;i++) {
			sum=sum+i;
			
		}
		System.out.println("Result is :"+" " + sum);
		
		
	}

}
