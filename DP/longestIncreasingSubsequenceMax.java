import java.util.*;

public class longestIncreasingSubsequenceMax {
	public static void main(String[] args) {
		int arr[] = {7,1,4,8,11,2,14,3};
		search(arr);
 	}

 	// using DP but its computation is less than o(n^2)
 	public static void search(int[] arr) {
 		int dp[] = new int[arr.length];

 		for (int i = 0; i < dp.length; i++) {
 			dp[i] = arr[i];
 		}

 		int maxSum = Integer.MIN_VALUE;

 		for (int i = 1; i < arr.length; i++) {
 			for (int j = 0; j < i; j++) {
 				if(arr[j] < arr[i] && arr[i] + dp[j] > dp[i]) {
 					dp[i] = arr[i] + dp[j];

 					maxSum = Math.max(maxSum,dp[i]);
 				}
 			}
 		}

 		System.out.println("Max Sum : "+maxSum);
 		System.out.print("DP : ");
 		for (int i = 0; i < dp.length; i++) {
 			System.out.print(dp[i] + " ");
 		}
 		System.out.println();

 	}


}