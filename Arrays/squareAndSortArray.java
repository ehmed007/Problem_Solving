import java.util.*;


public class squareAndSortArray {
	public static void main(String[] args) {
		int arr[] = {-4,-2,-1,3,5};
		sort2(arr);
	}

	public static void sort2(int[] arr) {
		int result[] = new int[arr.length];
		int i = 0;
		int j = arr.length - 1;
		int k = arr.length - 1;
		while(i <= j) {
			int squareFirst = arr[i]*arr[i];
			int squareLast = arr[j]*arr[j];
			if(squareFirst > squareLast) {
				result[k] = squareFirst;
				k--;
				i++;
			} else {
				result[k] = squareLast;
				k--;
				j--;
			}
		}

		for (int l = 0; l < result.length; l++) {
			System.out.print(result[l] + " ");
		}
		System.out.println();
	}
}