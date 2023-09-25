import java.util.*;

public class LongestCommonSubString {
	public static void main(String[] args) {
		String a = "xyzabcdx";
		String b = "abcdxyz";
		// String a = "xyca";
		// String b = "xyza";
		// System.out.println(search(a,b,4,4,0));
		search(a,b);
		System.out.println(lcs(a,b,a.length(),b.length(),0));
	}

	public static int lcs(String s1, String s2, int i, int j,int count) {
		if(i == 0 || j == 0) {
			return count;
		}
		else if(s1.charAt(i-1) == s2.charAt(j-1)) {
			count = lcs(s1,s2,i-1,j-1,count+1);
		};
		return Math.max(count,Math.max(lcs(s1,s2,i-1,j,0),lcs(s1,s2,i,j-1,0)));
	}

	public static void search(String s1, String s2) {
		int max = Integer.MIN_VALUE;
		int[][] dp = new int[s1.length()+1][s2.length()+1];
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if (s1.charAt(i-1) == s2.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1] + 1;
					if (dp[i][j] > max) {
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

}