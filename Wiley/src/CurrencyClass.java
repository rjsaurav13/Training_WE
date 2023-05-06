import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class CurrencyClass {
	public static void main(String[] args) {
		Currency usd = Currency.getInstance("USD");
		NumberFormat frm = NumberFormat.getCurrencyInstance(Locale.US);
		String formattedval=frm.format(108.5);
		System.out.println(formattedval);
		
	}

}
