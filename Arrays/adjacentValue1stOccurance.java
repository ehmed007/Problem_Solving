import java.util.*;

public class adjacentValue1stOccurance {
	public static void main(String[] args) {
		int arr[] = {2,3,2,4,5,6,7};
		System.out.println(search(arr, 6));
	}
	// complexity is < O(n)
	public static int search(int[] arr, int value) {
		if (arr.length == 0) {
			return -1;
		}

		int start = 0;

		while(start < arr.length) {
			if(arr[start] == value) {
				return start;
			}

			start += Math.abs(arr[start] - value);
		}
		return -1;
	}
}