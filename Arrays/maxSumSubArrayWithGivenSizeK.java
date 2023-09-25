import java.util.*;

public class maxSumSubArrayWithGivenSizeK {
	public static void main(String[] args) {
		int arr[] = {6,2,15,9,10};
		search(arr, 3);
	}

	// Sliding window approach O(n)
	public static void search(int[] arr, int k) {
		HashSet<Integer> set = new HashSet<>();
		int windowSum = 0;
		int maximum = Integer.MIN_VALUE;
		for(int i = 0; i < k; i++) {
			if(arr[i] > maximum) {
				maximum = arr[i];
			}
			windowSum += arr[i];
		}
		int maxSum = Integer.MIN_VALUE;
		for(int i = k; i < arr.length; i++) {
			if(windowSum > maxSum) {
				maxSum = windowSum;
			}
			set.add(windowSum);
			windowSum -= arr[i - k];
			windowSum += arr[i];
			if(windowSum > maxSum) {
				maxSum = windowSum;
			}
			set.add(windowSum);
		}

		System.out.print("Print all All Sum : ");
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		System.out.println("Max sum : " + maxSum);		
	}
}