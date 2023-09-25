import java.util.*;

public class separatePositiveNegative {
	public static void main(String[] args) {
		int arr[] = {3,-2,7,-5,-3,2,-8,-10};
		separate(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	// Complexity is O(n) and space is O(1)
	public static void separate(int[] arr) {
		int i = 0;
		int j = arr.length - 1;

		while(i < j) {
			if (arr[i] < 0 && arr[j] > 0) {
				i++;
				j--;
			}
			else if(arr[i] > 0 && arr[j] < 0) {
				int x = arr[i];
				arr[i] = arr[j];
				arr[j] = x;
				i++;
				j--;
			}
			else if(arr[i] > 0 && arr[j] > 0) {
				j--;
			}
			else if(arr[i] < 0 && arr[j] < 0) {
				i++;
			}
		}
	}

}