import java.util.*;

public class maxRepeatingValue {
	public static void main(String[] args) {
		int  arr[] = {2,3,7,7,4,4,3,3,3,3,3,5,7,2,2,7,2,2};
		search(arr);
	}

	// complexity is O(n)
	public static void search(int[] arr) {
		HashMap<Integer,Integer> map = new HashMap<>();
		int max_occurance = -1;
		int maxRepeatingValue = -1;
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
				if (map.get(arr[i]) > max_occurance) {
					max_occurance = map.get(arr[i]);
					maxRepeatingValue = arr[i];
				}
			} else {
				map.put(arr[i], 1);
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " : " + map.get(arr[i]));
		}

		System.out.println("\n"+maxRepeatingValue + " : " + max_occurance);
	}

}