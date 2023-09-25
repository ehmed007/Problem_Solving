import java.util.*;

public class findMissingNumber1ToN {
	public static void main(String[] args) {
		int arr[] = {3,2,4,6,1};
		int arr1[] = {3,2,4,5,6,1};
		find(arr1);
		System.out.println();
		search(arr1);
	}


	// Time Complexity is O(n) and space is O(1)
	public static void search(int[] arr) {
		int n = arr.length + 1;
		int sum = (n *(n+1))/2;
		for (int i=0; i < arr.length; i++) {
			sum -= arr[i];
		}
		System.out.println("Missing Number : " + sum);
	}

	// Time Complexity is O(n) and space is O(n)
	public static void find(int[] arr) {
		HashSet<Integer> set = new HashSet<>();

		for(int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}

		for(int i = 1; i <= arr.length + 1; i++) {
			if (!set.contains(i)) {
				System.out.println("Missing Number : " + i);
			}
		}
	}

}