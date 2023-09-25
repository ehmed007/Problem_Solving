import java.util.*;

public class pairOfTwo_Sum  {
	public static void main(String[] args) {
		int arr[] = {2,42,63,3,73,0};
		
		System.out.println("Using Brute Force");
		brute_force(arr, 66);		
		System.out.println("\n");

		System.out.println("Using Hashing Double loop");
		usingHashing1(arr, 105);
		System.out.println("\n");

		System.out.println("Using Hashing Single loop");
		usingHashing2(arr, 75);
		System.out.println("\n");

		System.out.println("Using Two Pointer");
		twoPointer(arr, 76);
	}

	// Complexity is O(n^2) and space O(1)
	public static void brute_force(int arr[], int sum) {
		for(int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum) {
					System.out.println(sum);
					System.out.println("Value 1 : " + arr[i] + "\nValue 2 : " + arr[j]);
				}
			}
		}
	}

	// Complexity is O(nlog(n)) due to sorting and space O(1)
	public static void twoPointer(int arr[], int sum) {
		int i = 0;
		int j = arr.length-1;
		Arrays.sort(arr);
		while(i < j) {
			if (arr[i] + arr[j] == sum) {
				System.out.println(sum);
				System.out.println("Value 1 : " + arr[i] + "\nValue 2 : " + arr[j]);
				break;
			}
			else if (arr[i] + arr[j] < sum) {
				i++;
			}
			else if (arr[i] + arr[j] > sum) {
				j--;
			}
		}
	}

	// Complexity is O(n+n) and space O(n) double loop 
	public static void usingHashing1(int arr[], int sum) {
		Hashtable<Integer, Integer> table = new Hashtable<>();
		for (int i = 0; i < arr.length; i++) {
			table.put(arr[i], arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			int d = sum - arr[i];
			if (table.get(d) != null) {
				System.out.println(sum);
				System.out.println("Value 1 : " + arr[i] + "\nValue 2 : " + d);
				break;
			}
		}
	}	

	// Complexity is O(n) and space O(n) single loop
	public static void usingHashing2(int arr[], int sum) {
		HashSet<Integer> s = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			int d = sum - arr[i];
			if (s.contains(d)) {
				System.out.println(sum);
				System.out.println("Value 1 : " + arr[i] + "\nValue 2 : " + d);
			} else {
				s.add(arr[i]);				
			}
		}
	}
}