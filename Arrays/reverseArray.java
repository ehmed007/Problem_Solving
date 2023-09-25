import java.util.*;

public class reverseArray {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		reverse(arr);
	}

	// complexity is O(n/2) and space O(1)
	public static void reverse(int[] arr) {
		for (int i = 0; i < arr.length/2; i++) {
			// int temp = arr[i];
			// arr[i] = arr[arr.length-1-i];
			// arr[arr.length-1-i] = temp;
			arr[i] += arr[arr.length-1-i];
			arr[arr.length-1-i] = arr[i] - arr[arr.length-1-i];
			arr[i] -= arr[arr.length-1-i];
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}