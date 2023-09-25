import java.util.*;

public class tripletsOfGivenSum {
	public static void main(String[] args) {
		int arr[] = {1,2,-3,4,-2,-1};
		int arr1[] = {1,10,-3,2,8,0};
		int arr2[] = {1,10,3,2,-5,0};
		int arr3[] = {1,10,3,2,-5,0,3,36,26,2};
		// search_all_triplets(arr);
		search_for_given_sum(arr, -1);
		search_using_hashing(arr1, 20);
		search_using_two_pointer(arr2, 0);
		search_quadruple_using_two_pointer(arr3,51);
	}

	// Brute force O(n*n*n) = O(n^3) to get all triplets
	public static void search_all_triplets(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				for (int k = j+1; k < arr.length; k++) {
					System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
				}
			}
		}
	}

	// Brute force O(n*n*n) = O(n^3) and space O(1) 
	public static void search_for_given_sum(int[] arr, int sum) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				for (int k = j+1; k < arr.length; k++) {
					if (arr[i]+arr[j]+arr[k] == sum) {
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k] + " Sum : " + sum);
						return;
					}
				}
			}
		}
	}

	// Search Triplets using hashing
	// Complexity is O(n*n) = O(n^2) and space O(n)
	public static void search_using_hashing(int[] arr, int sum) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int diff = sum - (arr[i] + arr[j]);
				if(map.containsKey(diff)) {
					if(arr[i] != arr[j] && arr[i] != diff && arr[j] != diff) { // this check for if zero occurs it will take it twice
						System.out.println(arr[i] + " " + arr[j] + " " + diff + " Sum : " + sum);
						return;
					}
				}
				else {
					map.put(arr[j],arr[j]);
				}
			}
		}
	}

	// Search Triplets using Two Pointer Approach
	// Complexity is nlog(n) + O(n*n) = O(n^2) and space O(1)
	public static void search_using_two_pointer(int[] arr, int sum) {
		Arrays.sort(arr); // (nlog(n))
		for (int i = 0; i < arr.length; i++) { // O(n*n)
			int diff = sum - arr[i];
			int start = 0;
			int end = arr.length - 1; 
			while(start < end) {
				if(arr[start] + arr[end] == diff && arr[start] != arr[end] && arr[start] != arr[i]) {
					System.out.println(arr[start] + " " + arr[end] + " " + arr[i] + " Sum : " + sum);
					return;
				} else if (arr[start] + arr[end] < diff) {
					start++;
				} else {
					end--;
				}
			}
		}
	}

	// Time Complexity is (nlog(n)) + n*n*n = O(n^3)
	public static void search_quadruple_using_two_pointer(int[] arr, int sum) {
		Arrays.sort(arr); // (nlog(n))
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int diff = sum - arr[i] - arr[j];
				int start = 0;
				int end = arr.length - 1;
				while(start < end) {
					if (arr[start] + arr[end] == diff) {
						System.out.println(arr[start] + " " + arr[end] + " " + arr[i] + " " + arr[j]);
						return;
					}
					else if(arr[start] + arr[end] < diff) {
						start++;
					}
					else {
						end--;
					}
				}	
			}
		}
	}

}