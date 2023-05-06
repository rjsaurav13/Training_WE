
public class StringBufferClass {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("wiley");
		StringBuffer sb1 = new StringBuffer("wiley");
		StringBuffer sb2= new StringBuffer("wiley");
		System.out.println(sb.equals(sb1));
		String s="wiley";
		System.out.println(s.equals(sb1.toString()));
		sb.insert(5," Edge");
		System.out.println(sb);
	}

}
