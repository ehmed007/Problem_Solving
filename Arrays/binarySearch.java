import java.util.*;


public class binarySearch {
	
	public static void main(String[] args) {
		int arr[] = {1,3,74,85,100};
		System.out.println(search(arr, 0, 5, 100));
	}
	// complexity is log(n)
	public static int search(int arr[], int start, int end, int value) {
		while(start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == value) {
				return mid;
			}
			if (arr[mid] < value) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}
	
}