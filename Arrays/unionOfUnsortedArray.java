import java.util.*;

public class unionOfUnsortedArray {
	public static void main(String[] args) {
		int arr2[] = {4,2,3,5,4,2,3};
		int arr1[] = {9,1,7,2,4,2,1,2};
		union(arr1, arr2);
	}

	public static void union(int[] arr1, int[] arr2) {
		HashSet<Integer> set = new HashSet<>();

		int i = 0;
		int j = 0;
		
		while(i < arr1.length || j < arr2.length) {
			if (i >= arr1.length) {
				if (!set.contains(arr2[j])) {
					set.add(arr2[j]);
				}
				j++;
			}
			else if (j >= arr2.length) {
				if (!set.contains(arr1[i])) {
					set.add(arr1[i]);
				}
				i++;
			}
			else {
				if (!set.contains(arr1[i])) {
					set.add(arr1[i]);
				}
				if (!set.contains(arr2[j])) {
					set.add(arr2[j]);
				}
				i++;
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