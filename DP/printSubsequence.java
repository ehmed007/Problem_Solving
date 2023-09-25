import java.util.*;

public class printSubsequence {
	public static void main(String[] args) {
		String a = "abc";
		check(0,a,"");
		System.out.println();
		int arr[] = {1,2,3};
		int res[] = new int[3];
		checkForArray(arr,0,res,0);
	}

	// Brute Force Complexity is O(2^n)
	public static void check(int i, String s, String f) {
		if(i == s.length()) {
			System.out.println(f);
			return;
		}
		check(i+1,s,f+s.charAt(i));
		check(i+1,s,f);
	}

	// Brute Force Complexity is O(2^n)
	public static void checkForArray(int[] arr, int i,int[] res, int j) {
		if(i == arr.length) {
			for (int k = 0; k < j; k++) {
				System.out.print(res[k] + " ");
			}
			System.out.println();
			return;
		}
		checkForArray(arr,i+1,res,j);
		res[j] = arr[i];
		checkForArray(arr,i+1,res,j+1);
	}

}