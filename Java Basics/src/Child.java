
public class Child extends Parent {

	public Child(int a, int b) {
		super(a, b);
	}

	int parVarA = 500;


	public void parMeth() {
		int parVarA = 200;
		int parVarB = 100;
		System.out.println("Child method");
		System.out.println(parVarA);
		System.out.println(parVarB);
		System.out.println(this.parVarA);
		System.out.println(super.parVarA);
		super.parMeth();

	}

	public static void main(String[] args) {
		Child c = new Child(20000, 500000);
		System.out.println(c.parVarA);
		c.parMeth();
	}

}
