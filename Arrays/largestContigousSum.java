import java.util.*;

public class largestContigousSum {
	public static void main(String[] args) {
		int arr[] = {-3,-4,4,-1,-2,100,5,-3};
		int arr1[] = {1,2,-41,3,12,12,-9,232,24,5,6};
		int arr2[] = {-2,-3,4,-1,-2,1,5,-3};
		System.out.println(search(arr));
		searchWithIndex(arr1);
	}

	// complexity is O(n)
	public static int search(int arr[]) {
		int current_max, original_max;
		current_max = original_max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			current_max = Math.max(arr[i], current_max + arr[i]);
			original_max = Math.max(current_max, original_max);
		}
		return original_max;
	}

	// complexity is O(n)
	public static void searchWithIndex(int arr[]) {
		int current_max, original_max;
		current_max = original_max = arr[0];
		int start = 0;
		int end = 0;
		for(int i = 1; i < arr.length; i++) {
			if (arr[i] > current_max + arr[i]) {
				current_max = arr[i];
				start = i;
			} else {
				current_max = current_max + arr[i];
			}

			if (current_max > original_max) {
				original_max = current_max;
				end = i;
			}
		}
		System.out.println("Max = " + original_max);
		System.out.println("Start = " + start);
		System.out.println("End = " + end);
	}
}