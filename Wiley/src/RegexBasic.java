import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexBasic {
	public static void main(String[] args) {
		String re="\\S\\S";
		String text="a ";
		Pattern pattern=Pattern.compile("agent \\d{3,4}");
		Matcher mt = pattern.matcher("agent 0007");
		boolean res =mt.matches();
		System.out.println(res);
				
	}

}
