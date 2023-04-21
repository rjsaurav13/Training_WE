
public class MethodType {
	public int add(int v1,int v2) {
		int val=v1+v2;
		return val;
	}
	public static void mul(int v1,int v2) {
		int val=v1*v2;
		System.out.println(val);
	}
	
	public static void main(String[] args) {
		mul(34,23);
		MethodType mt=new MethodType();
		int sum=mt.add(20,100);
		System.out.println(sum);
	}
}
