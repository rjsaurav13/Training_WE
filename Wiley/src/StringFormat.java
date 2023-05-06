import java.util.Arrays;
import java.util.List;

public class StringFormat {
	public static void main(String[] args) {
		String title="java Developer";
		float salary=2000.39999f;
		System.out.format("%s has %.3f usd salary", title,salary);
		List<String> techStack=Arrays.asList(
				"Essential java",
				"Head first java",
				"java design pattern"
				);
		for(String book:techStack) {
			System.out.format("%-40s - In Stock%n",book);
		}
	}

}
