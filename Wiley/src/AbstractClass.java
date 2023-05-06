
abstract class test1{
	public abstract void m1();
	{
		System.out.println("test1 instance block");
	}
	public void m2() {
		System.out.println("test1 m2 method");
	}
	public static void main(String[] args) {
		System.out.println("Abstract main method");
	}
	public test1() {
		System.out.println("test1 constructor");
	}
	static {
		System.out.println("test2 static blocck");
	}
}
class test2 extends test1{
	{
		System.out.println("test2 instance class");
	}
	public void m1() {
		System.out.println("test2 m1 method");
	}
	public test2() {
		System.out.println("Test2 constructor");
	}
	static{
		System.out.println("test2 static block");
	}
}
public class AbstractClass {
	public static void main(String[] args) {
		test2 t2=new test2();
		t2.m1();
		t2.m2();
		test1.main(args);
		
	}

}
