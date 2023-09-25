import java.util.*;

public class equilibrium {
	public static void main(String[] args) {
		int arr[] = {1,6,7,0,7};
		int arr1[] = {1,2,2,3,4,1};
		System.out.println(find(arr));
		System.out.println(find(arr1));
	}

	// complexity is O(n)
	public static int find(int[] arr) {
		int sum_so_far = 0;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			sum_so_far += arr[i];
			if (sum == sum_so_far) {
				return i;
			}
			sum -= arr[i];
		}
		return -1;
	}
}