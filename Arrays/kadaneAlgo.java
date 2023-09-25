import java.util.*;

public class kadaneAlgo {
	public static void main(String[] args) {
		//kadane Algorithm is used to find the maximum sum subarray 
		//but it only work for mix value
		//it does not work for all negative values in array

		int arr[] = {-3,2,-7,6,-2,-4,-8,5};
		int arr1[] = {1,2,3,-4,};
		search(arr1);	
	}

	public static void search(int[] arr) {
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if(sum < 0) {
				sum = 0;
				continue;
			}
			if (sum > maxSum) {
				maxSum = sum;
			}
		}

		System.out.println("MaxSUM : "+maxSum);
	}

}