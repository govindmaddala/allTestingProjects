
public class HelloWorld {
	
	static {
		System.out.println("static block");
	}
	
	static void method() {
		System.out.println("static method");
	}

	public static void main(String[] args) {
		
		HelloWorld hw=new HelloWorld();
		method();
		System.out.println("Hello world");
	}
}

