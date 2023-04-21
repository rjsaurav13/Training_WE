package Day1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome Shoppers!! ");
		Map<String, Integer> item = new HashMap<String, Integer>();
		item.put("itemcode =1 Mobile", new Integer(3000));
		item.put("itemcode =2 TV", new Integer(4000));
		item.put("itemcode =3 AC", new Integer(1000));
		item.put("itemcode =4 Laptop", new Integer(5000));

		System.out.println("Enter number of items to be purchased: ");
		int itval = scanner.nextInt();

		for(int i=0;i<itval;i++) {
			int temp=scanner.nextInt();
			
		}

	}
}
