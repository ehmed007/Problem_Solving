import java.util.*;

public class segregateOddAndEven {
	public static void main(String[] args) {
		int arr[] = {2,4,1,6,3,8,7};
		int arr1[] = {1,0,1,1,0,1,0};
		int arr2[] = {5,6,0,4,6,0,9,0,8};
	
		segregateEvenOdd(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		segregateZeroOne(arr1);
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

		pushZeroAtEnd(arr2);
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
	}

	public static void segregateEvenOdd(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		while(i < j) {
			if (arr[i]%2==0 && arr[j]%2!=0) {
				i++;
				j--;
			}
			else if (arr[i]%2!=0 && arr[j]%2==0) {
				int x = arr[i];
				arr[i] = arr[j];
				arr[j] = x;
			}
			else if (arr[i]%2==0 && arr[j]%2==0) {
				i++;
			}
			else if (arr[i]%2!=0 && arr[j]%2!=0) {
				j--;
			}
		}
	}

	public static void segregateZeroOne(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		while(i < j) {
			if (arr[i] == 0 && arr[j] == 1) {
				i++;
				j--;
			}
			else if (arr[i] == 1 && arr[j] == 0) {
				int x = arr[i];
				arr[i] = arr[j];
				arr[j] = x;
			}
			else if (arr[i] == 0 && arr[j] == 0) {
				i++;
			}
			else if (arr[i] == 1 && arr[j] == 1) {
				j--;
			}
		}
	}

	public static void pushZeroAtEnd(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		while(i < j) {
			if (arr[i] != 0 && arr[j] == 0) {
				i++;
				j--;
			}
			else if (arr[i] == 0 && arr[j] != 0) {
				int x = arr[i];
				arr[i] = arr[j];
				arr[j] = x;
			}
			else if (arr[i] != 0 && arr[j] != 0) {
				i++;
			}
			else if (arr[i] != 0 && arr[j] == 0) {
				j--;
			}
		}
	}

}