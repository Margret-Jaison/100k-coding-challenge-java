
public class Hello {
	static int a=10;
	int b=20;
	public static void main(String ar[]){
	
	 System.out.println(a);
	 Hello h=new Hello();
	 Hello h1=new Hello();
	 h.hello();
	 hey();
	 h.a=50;
	 h1.a=100;
	 System.out.println("h.a:"+h.a);
	}
	
	void hello(){}
	
	static void hey() {}
}
