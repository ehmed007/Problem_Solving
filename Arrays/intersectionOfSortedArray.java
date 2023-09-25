import java.util.*;

public class intersectionOfSortedArray {
	public static void main(String[] args) {
		int arr2[] = {2,2,2,3,3,4,7,8};
		int arr1[] = {1,2,4,4,6,6,7,8,10};
		intersection(arr1, arr2);
	}
	
	// Complexity is O(m + n)
	public static void intersection(int[] arr1, int[] arr2) {
		HashSet<Integer> set = new HashSet<>();

		int i = 0;
		int j = 0;

		while(i < arr1.length && j < arr2.length) {
			if (arr1[i] == arr2[j]) {
				if (!set.contains(arr1[i])) {
					set.add(arr1[i]);
				}
				i++;
				j++;
			}
			else if (arr1[i] < arr2[j]) {
				i++;
			}
			else {
				j++;
			}
		}

		Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
		System.out.println();
	}

}