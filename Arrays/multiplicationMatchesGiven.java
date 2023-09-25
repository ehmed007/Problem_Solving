import java.util.*;

public class multiplicationMatchesGiven {
	public static void main(String[] args) {
		int arr[] = {4,1,3,10,7,5,8};
		search(arr, 15);
	}

	public static void search(int[] arr, int givenValue) {
		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			int value = givenValue/arr[i];
			if(givenValue%arr[i] == 0 && set.contains(value)) {
				System.out.println(arr[i] + " : " + value);
			}
			else {
				set.add(arr[i]);
			}
		}
	}
}