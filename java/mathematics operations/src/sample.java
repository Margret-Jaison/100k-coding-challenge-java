import java.util.Scanner;

public class sample {
  public static void main(String args[]) {
	  Scanner sc =new Scanner(System.in);
	  System.out.println("Enter 2 numbers");
	  int a=sc.nextInt();
	  int b=sc.nextInt();
	  Operations s= new Operations();
	  System.out.println("Choose a number  1.addition  2.subtraction  3.multiplication  4. Division");
	  int sel=sc.nextInt();
	  if(sel==1) {
		  
		  s.addition(a,b);
	  }
	  else if(sel==2) {
		  
		  s.subtraction(a,b);
	  }
	  else if(sel==3){
		  s.multiplication(a,b);
		  
	  }
	  else if(sel==4) {
		  
		  s.division(a, b);
	  }
	  else {
		  
		  System.out.println("invalid");
	  }
	  
  }
}
