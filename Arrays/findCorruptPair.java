import java.util.*;

public class findCorruptPair {
	public static void main(String[] args) {
		int arr[] = {4,3,1,5,5};
		find(arr);
	}

	// Time Complexity is n + n = O(n) and Space is O(1)
	public static void find(int[] arr) {
		cyclicSort(arr); // --> O(n)
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 1; i < arr.length; i++) {
			if(arr[i-1] == arr[i]) {
				System.out.println("Missing : " + (arr[i-1]+1));
				System.out.println("Duplicate : " + arr[i]);
				return;
			}
			if(arr[i-1] != arr[i]) {
				System.out.println("Missing : " + (arr[i-1]+1));
				System.out.println("Duplicate : " + arr[i]);
				return;
			}
		}
	}

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