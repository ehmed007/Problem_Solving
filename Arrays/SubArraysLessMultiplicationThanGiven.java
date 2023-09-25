import java.util.*;

public class SubArraysLessMultiplicationThanGiven {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		search(arr, 10);
	}

	public static void search(int[] arr, int givenNumber) {
		List<List<Integer>> result = new ArrayList<>();
		int product = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < givenNumber) {
				List<Integer> sublist = new ArrayList<>();
				sublist.add(arr[i]);
				result.add(sublist);
				count++;
			}
			product = arr[i];

			for (int j = i + 1; j < arr.length; j++) {
				product *= arr[j];

				if(product < givenNumber) {
					List<Integer> sublist = new ArrayList<>();
					for (int k = i; k <= j; k++) {
						sublist.add(arr[k]);
					}
					result.add(sublist);
					count++;
				} else {
					break;
				}
			}
		}
		Collections.sort(result,(n1, n2) -> {

			if(n1.size() > n2.size()) {
				return 1;
			}
			else if (n1.size() < n2.size()) {
				return -1;
			}
			else {
				return 0;
			}
		});
		System.out.println(result);
		System.out.println(" Count : " + count);
	}
}