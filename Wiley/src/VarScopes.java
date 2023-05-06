
public class VarScopes {
	int ins=20;
	 int val1=12;
	 int val=22;
	static String name="Saurav";
	public void sum() {
		int val=10;
		int val1=25;
		System.out.println("sum method: "+(this.val+this.val1));
	}
	public static void main(String[] args) {
		int loc=10;
		VarScopes vso= new VarScopes();
		System.out.println(loc);
		System.out.println(vso.ins);
		System.out.println(name);
		vso.sum();
	}
}
