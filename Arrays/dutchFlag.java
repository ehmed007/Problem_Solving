import java.util.*;

public class dutchFlag {
	public static void main(String[] args) {
		int arr[] = {0,1,2,0,2,2,1,0,2};
		sort1(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);		
		}	
	}
	
	public static void sort1(int[] arr) {
		int low = 0;
		int mid = 0;
		int high = arr.length - 1;
		while(mid <= high) {
			switch(arr[mid]) {
			case 0:
				if(arr[low] != arr[mid]) {
					int t = arr[low];
					arr[low] = arr[mid];
					arr[mid] = t;
				}
				low++;
				mid++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				if(arr[high] != arr[mid]) {
					int t = arr[high];
					arr[high] = arr[mid];
					arr[mid] = t;
				}
				high--;
			}
		}
	}
}