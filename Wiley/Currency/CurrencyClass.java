import java.util.Scanner;

public class CurrencyClass {
public static void main(String[] args) {
		
		System.out.println("1 Ru");
		System.out.println("2 Dollar");
		System.out.println("3 Euro");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose the currency");
		int choice = sc.nextInt();
		System.out.println("Enter the amount");
		double amount = sc.nextDouble();
	
		switch (choice) {
		case 1:
			Ruppe_to_other(amount);
			break;
		case 2:
			Dollar_to_other(amount);
			break;
		case 3:
			Euro_to_other(amount);
			break;
		case 4:
			JYN_to_other(amount);
		default:
			System.out.println("Invalid choice");
		}

	}

	public static void JYN_to_other(double amt) {
	
		System.out.println("1 JYN = " + 0.01 + " Dollar");
		System.out.println();

		System.out.println(amt + " JYN = " + (amt * 0.01) + " Dollar");
		System.out.println();

		System.out.println("1 JYN = " + 0.0066 + " Euro");
		System.out.println();
		System.out.println(amt + " JYN = " + (amt * 0.0066) + " Euro");
		System.out.println();
		System.out.println("1 JYN = " + 0.6061 + " Rupee");
		System.out.println();
		System.out.println(amt + " JYN = " + (amt * 0.6061) + " Rupee");
		System.out.println();
	
}

	public static void Ruppe_to_other(double amt) {
		System.out.println("1 Ruppe = " + 0.013 + " Dollar");
		System.out.println();

		System.out.println(amt + " Ruppe = " + (amt * 0.013) + " Dollar");
		System.out.println();

		System.out.println("1 Ruppe = " + 0.012 + " Euro");
		System.out.println();
		System.out.println(amt + " Ruppe = " + (amt * 0.012) + " Euro");
		System.out.println();
		System.out.println("1 Rupee = " + 1.68 + " JYN");
		System.out.println();
		System.out.println(amt + " Rupee = " + (amt * 0.0066) + " JYN");
		System.out.println();

	}

	public static void Dollar_to_other(double amt) {
		System.out.println("1 Dollar = " + 79.37 + " Ruppe");
		System.out.println();
		System.out.println(amt + " Dollar = " + (amt * 79.37) + " Ruppe");
		System.out.println();

		System.out.println("1 Dollar= " + 0.98 + " Euro");
		System.out.println();

		System.out.println(amt + " Dollar = " + (amt * 0.98) + " Euro");
		System.out.println("1 dollar = " + 134.84 + " JYN");
		System.out.println();
		System.out.println(amt + " JYN = " + (amt * 134.84) + " JYN");
		System.out.println();
	}

	public static void Euro_to_other(double amt) {
		System.out.println("1 Euro = " + 80.85 + " Ruppe");
		System.out.println();
		System.out.println(amt + " Euro = " + (amt * 80.85) + " Ruppe");
		System.out.println();

		System.out.println("1 Euro = " + 1.02 + " Dollar");
		System.out.println();

		System.out.println(amt + " Euro = " + (amt * 1.02) + " Dollar");
		System.out.println("1 Euro = " + 151.16 + " JYN");
		System.out.println();
		System.out.println(amt + " Euro = " + (amt * 151.16) + " JYN");
		System.out.println();
	}
}
