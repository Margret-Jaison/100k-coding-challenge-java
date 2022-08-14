
public class B extends A{
	
	int a;
	
	B(){
		
		System.out.println("Its B constructor");
	}
	
	B(int b){
		super(10);
		System.out.println("Its argument constructor of B");
	}
	void display() {
		System.out.println("Its B");
		super.display();
		a=20;
		super.a=30;
		int c=a+super.a;
		System.out.println(c);
	}
	void baseDisplay() {
		super.display();
	}

	public static void main(String[] args) {
		B b=new B(10);
//		b.display();
//		b.baseDisplay();
		
	}
}
