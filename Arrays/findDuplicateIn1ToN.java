import java.util.*;

public class findDuplicateIn1ToN {
	public static void main(String[] args) {
		int arr[] = {4,3,4,2,1,5,7,7,1};
		search(arr);
	}
	// Complexity is n(sorting) + n = O(n)
	public static void search(int[] arr) {
		cyclicSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 1; i <= arr.length ; i++) {
			if(i != arr[i-1]) {
				System.out.println("Duplicate : "+arr[i-1] + " Missing : "+i);
			}
		}
	}

	// Complexity is O(n)
	public static void cyclicSort(int[] arr) {
		int i = 0;
		while(i < arr.length) {
			if(i+1 == arr[i]) {
				i++;
			}
			// to remove difficulty in sorting due to duplicates
			else if(arr[i] == arr[arr[i] - 1]) {
				i++;
			}
			else {
				int v = arr[i] - 1;
				int x = arr[i];
				arr[i] = arr[v];
				arr[v] = x;
			}

		}
	}
}