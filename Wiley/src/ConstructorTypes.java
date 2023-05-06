
public class ConstructorTypes {
	public ConstructorTypes(int a, int b) {
		System.out.println(a + b);
	}

	public ConstructorTypes(float a, int b) {
		System.out.println(a + b);
	}

	public ConstructorTypes() {
		System.out.println("No parameter");
	}

	public static void main(String[] args) {
		ConstructorTypes ct = new ConstructorTypes();
		ConstructorTypes ct1 = new ConstructorTypes(2, 3);
		ConstructorTypes ct2 = new ConstructorTypes(2.4f, 3);
	}
}
