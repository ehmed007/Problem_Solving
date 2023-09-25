import java.util.*;

public class smallestSubArrayToSort {
	public static void main(String[] args) {
		int arr[] = {1,2,5,3,0,12,13,8,15,18};
		int arr1[] = {0,1,2,5,3,12,13,15,18};
		int arr2[] = {1,2,5,3,0,22,13,8,15,18}; 
		search(arr);
		search(arr1);
		search(arr2);
	}

	// Time Complexity O(n^2)
	public static void search(int[] arr) {
		int i = 0;
		int j = arr.length-1;
		boolean flag1 = true;
		boolean flag2 = true;
		while(flag1 == true || flag2 == true) {
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			for (int k = i; k <= j; k++) {
				if (arr[k] < min) {
					min = arr[k];
				}
				if (arr[k] > max) {
					max = arr[k];
				}
			}
			if (arr[i] == min && flag1 == true) {
				i++;
			}
			else {
				flag1 = false;
			}
			if (arr[j] == max && flag2 == true) {
				j--;
			}
			else {
				flag2 = false;
			}
		}
		System.out.println(i+ " " +j);
	}

}