
public class StringClasses {
	public static void main(String[] args) {
		String s1 = "wiley";
		String s2 = "wiley";
		String s3 = new String("wiley");
		String s4 = new String("wiley");
/*		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		System.out.println(s1 == s3);
*/
		String str="I am a Java Developer";
		String str1="Python";
		String str2=str.concat(" "+str1);
		System.out.println(str.charAt(10));
		System.out.println(str2);
		String st[] =str.split("");
		for(String string: st) {
			System.out.println(string);
		}
	}
}
