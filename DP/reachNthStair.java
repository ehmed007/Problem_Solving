import java.util.*;

public class reachNthStair {
	public static void main(String[] args) {
		System.out.println(calculate(4));
		System.out.println(calculateMinimum(5));
	}
	// Time Complexity is O(n^2) but we can optimize it using DP
	// And Space Complexity is O(n)
	public static int calculate(int n) {
		if(n == 0) return 1;
		if(n == 1) return 1;
		if(n == 2) return 2;

		return calculate(n-1) + calculate(n-2) + calculate(n-3);
	}

	// Time Complexity is O(n^2) but we can optimize it using DP
	// And Space Complexity is O(n)
	public static int calculateMinimum(int n) {
		if(n == 0) return 0;
		if(n == 1 || n == 2 || n == 3) return 1;

		return 1 + Math.min(Math.min(calculateMinimum(n-1),calculateMinimum(n-2)),calculateMinimum(n-3));
	}

}