import java.util.*;

public class longestIncreasingSubsequenceLength {
	public static void main(String[] args) {
		int arr[] = {7,1,4,8,11,2,14,2};
		// find(arr);
		search(arr);
 	}

 	// Brute force o(n^2)
 	public static void find(int[] arr) {
 		int largest = Integer.MIN_VALUE;
 		int sum = Integer.MIN_VALUE;
 		for (int i = 0; i < arr.length; i++) {
 			Deque<Integer> deque = new ArrayDeque<>();
 			for (int j = i; j < arr.length; j++) {
 				if (arr[j] >= arr[i]) {
 					if (deque.isEmpty()) {
 						deque.add(arr[j]);
 					}
 					else {
 						if(deque.getLast() < arr[j]) {
 							deque.add(arr[j]);
 						}
 					}	
 				}
 			}
 			if(deque.size() > largest) {
 				largest = deque.size();
 			}
 			int sum1 = 0;
 			while(!deque.isEmpty()) {
 				int x = deque.pop();
 				sum1 += x;
 				System.out.print(x + " ");
 			}
 			if(sum1 > sum) {
 				sum = sum1;
 			}
 			System.out.println();
 		}
 		System.out.println("Largest : " + largest);
 		System.out.println("MaxSum : " + sum);
 	}

 	// using DP but its computation is less than o(n^2)
 	public static void search(int[] arr) {
 		int dp[] = new int[arr.length];

 		for (int i = 0; i < dp.length; i++) {
 			dp[i] = 1;
 		}

 		int maxLength = Integer.MIN_VALUE;

 		for (int i = 1; i < arr.length; i++) {
 			for (int j = 0; j < i; j++) {
 				if(arr[j] < arr[i] && dp[j]+1 > dp[i]) {
 					dp[i] = dp[i] + 1;
 					maxLength = Math.max(maxLength,dp[i]);
 				}
 			}
 		}

 		System.out.println("Max Length : "+maxLength);
 		System.out.print("DP : ");
 		for (int i = 0; i < dp.length; i++) {
 			System.out.print(dp[i] + " ");
 		}
 		System.out.println();

 	}


}