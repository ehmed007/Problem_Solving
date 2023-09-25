import java.util.*;


public class cyclicSort {
	public static void main(String[] args) {
		int[] arr = {3,12,4,6,2,1,7,8,5,10,9,11};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		sort1(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	// Complexity is O(n) and space is O(1)
	public static void sort1(int[] arr) {
		int i = 0;
		while(i < arr.length) {
			if(i+1 == arr[i]) {
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