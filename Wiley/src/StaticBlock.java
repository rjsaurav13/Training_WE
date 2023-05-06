
public class StaticBlock {
	static {
		System.out.println("Static block");
	}
	{
		System.out.println("Instance Block");
	}

	public StaticBlock() {
		System.out.println("Inside Constructor Block");
	}

	public static void main(String[] args) {
		new StaticBlock();
		new StaticBlock();
		new StaticBlock();
	}

}
