
public class InstanceOrder {
	String name;
	{
		name = "saurav";
		System.out.println("Instance Block");
	}

	public InstanceOrder() {
		System.out.println(name);
		System.out.println("Constructor Block ");
	}

	public InstanceOrder(int a, int b) {
		System.out.println("parametarized construction " + (a + b));
	}

	public static void main(String[] args) {
		InstanceOrder ior = new InstanceOrder();
		new InstanceOrder(2, 3);
	}

}
