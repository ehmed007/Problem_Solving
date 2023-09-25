import java.util.*;

public class unionOfSortedArray {
	public static void main(String[] args) {
		int arr2[] = {2,3,4,7,8};
		int arr1[] = {1,2,4,6,7,8,10};
		union(arr1, arr2);
	}

	// complexity is O(m+n)
	public static void union(int[] arr1, int[] arr2) {
		int m = arr1.length;
		int n = arr2.length;
		int result[] = new int[m+n];

		int i = 0;
		int j = 0;
		int k = 0;

		while(i < arr1.length || j < arr2.length) {
			if (i >= arr1.length) {
				result[k] = arr2[j];
				j++;
				k++;
			}
			else if (j >= arr2.length) {
				result[k] = arr1[i];
				i++;
				k++;
			}
			else {
				if (arr1[i] == arr2[j]) {
					result[k] = arr1[i];
					i++;
					j++;
					k++;
				}
				else {
					if (arr1[i] < arr2[j]) {
						result[k] = arr1[i];
						i++;
						k++;
					}
					else {
						result[k] = arr2[j];
						j++;
						k++;	
					}
				}
			}
		}
		for (int l = 0; l < k; l++) {
			System.out.print(result[l]+" ");
		}
	}

}