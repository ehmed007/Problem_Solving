import java.util.*;

public class getMaximumOfAllSubArraysOfSizeK {
	public static void main(String[] args) {
		int arr[] = {2,5,9,3,1,7};
		search(arr,4);
	}

	public static void search(int[] arr, int k) {
		for (int i = 0; i + k-1 < arr.length; i++) {
			int max = Integer.MIN_VALUE;
			int j = i;
 			for(j = i; j < i + k; j++) {
				System.out.print(arr[j] + " ");
				if(arr[j] > max) {
					max = arr[j];
				}	
 			}
			System.out.println(" "+max + " " + i + " " + (j-1));
		}
	}

}