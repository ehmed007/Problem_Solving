import java.util.*;

public class removeAllDuplicates {
	public static void main(String[] args) {
		int arr[] = {1,4,4,4,5,6,7,7,8};
		// removeDuplicates(arr);
		getUniqueNumberLength(arr);
	}

	public static void removeDuplicates(int[] arr) {
		int previous = 0;
		int i = 1;
		while(i < arr.length) {
			if (arr[previous] != arr[i]) {
				System.out.println(arr[previous]);
			}
			if(i + 1 == arr.length) {
				System.out.println(arr[i]);
			}
			i++;
			previous++;
		}
	}

	public static void getUniqueNumberLength(int[] arr) {
		int start = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i-1]) {
				arr[start++] = arr[i];
			}
		}
		for (int i = 0; i < start; i++ ) {
			System.out.println(arr[i] + " ");
		}
	}

}