import java.util.*;

public class fibonacciSeries {
	public static void main(String[] args) {
		// System.out.println(fibonacci(0));
		// System.out.println(fibonacci(1));
		// System.out.println(fibonacci(2));
		// System.out.println(fibonacci(3));
		// System.out.println(fibonacci(4));
		// System.out.println(fibonacci(5));


		int arr[] = new int[10];
		System.out.println(fibonacciUsingTOPDOWN(arr, 5));

		System.out.println(fibonacciUsingBOTTOMUP(0));


	}

	// recursive solution Time Complexity is O(2^n) and space complexity is O(n)
	// because it uses system Stack
	public static int fibonacci(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		
		return fibonacci(n-1) + fibonacci(n-2);
	}

	// using DP and TOP-DOWN approach
	public static int fibonacciUsingTOPDOWN(int[] arr, int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		
		if(arr[n] == 0) {
			arr[n] = fibonacciUsingTOPDOWN(arr, n-1) + fibonacciUsingTOPDOWN(arr, n-2);
		}
		return arr[n];
	}

	public static int fibonacciUsingBOTTOMUP(int n) {
		
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}

		int dp[] = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		return dp[n];
	}

}