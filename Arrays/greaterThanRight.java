import java.util.*;

public class greaterThanRight {
	public static void main(String[] args) {
		int arr[] = {14,15,8,9,5,2};
		show(arr);
	}

	// complexity is O(n)
	public static void show(int[] arr) {
		int max = arr[arr.length -1];
		for(int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] >= max) {
				max = arr[i];
				System.out.println(arr[i]);
			}
		}
	}
}