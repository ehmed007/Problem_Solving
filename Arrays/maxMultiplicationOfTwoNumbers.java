import java.util.*;

public class maxMultiplicationOfTwoNumbers {
	public static void main(String[] args) {
		int arr[] = {-7,4,1,2,7,3};
		search(arr);
	}

	public static void search(int[] arr) {
		int max = Integer.MIN_VALUE;
		int second_max = Integer.MIN_VALUE;

		int min = Integer.MAX_VALUE;
		int second_min = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				second_min = min;
				min = arr[i];
			}
			else if(arr[i] < second_min && arr[i] != min) {
				second_min = arr[i];
			}
			if (arr[i] > max) {
				second_max = max;
				max = arr[i];
			}
			else if(arr[i] > second_max && arr[i] != max) {
				second_max = arr[i];
			}
		}
		System.out.println("Max : " + max);
		System.out.println("Second Max : " + second_max);
		System.out.println("Min : " + min);
		System.out.println("Second Min : " + second_min);
		System.out.println("Max Multiplication : " + max + " , " + second_max + " : " + max*second_max);
	}
}