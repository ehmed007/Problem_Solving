import java.util.*;

public class findFirstMissingPositiveNumber {
	public static void main(String[] args) {
		int arr[] = {-2,11,1,-3,2,10,4};
		cyclicSort(arr);
		search(arr);		
	}

	public static void cyclicSort(int[] arr) {
		int i = 0;
		while(i < arr.length) {
			if (arr[i] < 0) {
				i++;
				continue;
			}
			if(i+1 == arr[i]) {
				i++;
			}
			else {
				int v = arr[i] - 1;
				if(v < arr.length) {
					int x = arr[i];
					arr[i] = arr[v];
					arr[v] = x;	
				}
				else {
					i++;
				}
			}

		}
	}

	public static void search(int[] arr) {
		for (int i = 0; i < arr.length; i++ ) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != i+1) {
				System.out.println("Missing Number : " + (i+1));
				return;
			}
		}
		
	}
}