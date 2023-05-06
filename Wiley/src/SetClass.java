import java.util.TreeSet;

public class SetClass {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("h");
		ts.add("e");
		ts.add("l");
		ts.add("l");
		ts.add("o");
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.headSet("h"));
	}

}
