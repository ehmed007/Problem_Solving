import java.util.*;

public class intersectionOfUnsortedArray {
	public static void main(String[] args) {
		int arr2[] = {4,2,3,5,4,2,3};
		int arr1[] = {9,1,7,2,4,2,1,2};
		intersection(arr1, arr2);
	}
	
	// Complexity is O(m + n)
	public static void intersection(int[] arr1, int[] arr2) {
		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();

		for (int i = 0; i < arr1.length; i++) {
			set1.add(arr1[i]);
		}
		
		for (int i = 0; i < arr2.length; i++) {
			set2.add(arr2[i]);
		}

		Iterator<Integer> it = set1.iterator();
        while (it.hasNext()) {
        	int v = it.next();
        	if(set2.contains(v)) {
	            System.out.print( v + " ");
        	}
        }
		System.out.println();
	}

}