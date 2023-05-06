
public class FinalBlock {
	public static void main(String[] args) {

		try {
			System.out.println("1111111");

			System.out.println("wiley");
			System.out.println("10/0");
		} catch (Exception e) {
			System.out.println("catch block");
			e.printStackTrace();
		} finally {
			System.out.println("Clone connection	");
		}
	}

}
