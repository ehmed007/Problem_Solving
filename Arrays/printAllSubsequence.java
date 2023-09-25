import java.util.*;

public class printAllSubsequence {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		print(arr,0,3);
	}

	public static void print(int[] arr, int start, int end) {
		if(start == end) {
			System.out.println(arr[start]);
			return;
		}
		print(arr,start+1,end);
		// print(arr,start,end-1);
	}

}