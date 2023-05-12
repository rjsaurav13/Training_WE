import java.util.*;

public class DP1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int[] dp = new int[n + 1];
		dp[0] = 0;
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		System.out.println(dp[n]);

		int a = 0;
		int b = 1;
		int c = 0;
		for (int i = 2; i < n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		System.out.println(c);
		n = 5;

		System.out.println(fib(n, dp));
	}

	public static int fib(int n, int[] dp) {
		if (n == 1 || n == 0) {
			return n;
		}

		if (dp[n] != -1) {
			return dp[n];
		}

		return dp[n] = fib(n - 1, dp) + fib(n - 2, dp); 
	}

}