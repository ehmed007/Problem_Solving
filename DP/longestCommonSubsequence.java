import java.util.*;

public class longestCommonSubsequence {
	public static void main(String[] args) {
		String a = "xyzabcdx";
		String b = "abcdxyz";
		// String a = "xyca";
		// String b = "xyza";
		searchSequence(a,b);
		System.out.println(lcs(a,b,0,0));
	}

	public static void searchSequence(String s1, String s2) {
		int max = Integer.MIN_VALUE;
		int[][] dp = new int[s1.length()+1][s2.length()+1];
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if (s1.charAt(i-1) == s2.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1] + 1;
					if(dp[i][j] > max) {
						max = dp[i][j];
					}
				}
				else {
					dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
					if(dp[i][j] > max) {
						max = dp[i][j];
					}
				}
			}
		}
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(max);
	}

	public static int lcs(String s1, String s2, int i, int j) {
		if(i == s1.length() || j == s2.length()) {
			return 0;
		}
		else if(s1.charAt(i) == s2.charAt(j)) {
			return 1 + lcs(s1,s2,i+1,j+1);
		}
		else {
			return Math.max(lcs(s1,s2,i+1,j),lcs(s1,s2,i,j+1));
		}
	}

}
