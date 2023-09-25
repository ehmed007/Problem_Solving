import java.util.*;

public class frequency {
	public static void main(String[] args) {
		int arr[] = {1,2,3,6,3,6,6,9};
		count(arr);	
	}

	// complexity is O(n) with hashMap
	public static void count(int[] arr) {
		int n = 10;
		int[] hash = new int[n];

		for (int i = 0; i < arr.length; i++) {
			hash[arr[i] % n]++;
		}
			
		for (int i = 0; i < hash.length; i++) {
			System.out.println(i + " : " + hash[i]);
		}
	}

}