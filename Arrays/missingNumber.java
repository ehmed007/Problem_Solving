import java.util.*;

public class missingNumber {
	public static void main(String[] args) {
		int arr[] = {1,2,3,5,6};
		int arr1[] = {4,6,7,10,11,13};
		search(arr);	
		search1(arr1);	
	}

	// Time Complexity is O(n) and space is O(1)
	public static void search(int[] arr) {
		int n = arr.length + 1;
		int sum = (n *(n+1))/2;
		for (int i=0; i < arr.length; i++) {
			sum -= arr[i];
		}
		System.out.println(sum);
	}

	// for more missing number more than one 
	// complexity is O(n*n-1)
	// array should be sorted
	public static void search1(int[] arr) {
		int diff = 0;
		for (int i=1; i < arr.length; i++) {
			diff = arr[i] - arr[i-1];
			if (diff > 1) {
				int val = arr[i-1];
				for (int j = diff; j > 1; j--) {
					System.out.println(++val);
				}
			}
		}
	}
}