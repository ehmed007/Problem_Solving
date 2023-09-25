import java.util.*;

public class LongestSubArrayWithAll1s {
	public static void main(String[] args) {
		int arr[] = {0,1,0,1,0,1,1,1,1};
		// max 0 allowed to replace with 1
		find(arr, 1);
	}

	public static void find(int[] arr, int k) {
		int numberOfZero = 0;
		int start = 0;
		int end = 0;
		int maxLength = 0;
		while (end < arr.length) {
      		if (arr[end] == 0) {
        		numberOfZero++;
      		}
      		if (numberOfZero > k) {
        		if (arr[start] == 0) {
          			numberOfZero--;
        		}
        		start++;
      		}
      		maxLength = Math.max(end - start + 1, maxLength);
      		end++;
    	}

		System.out.println("start : " + start);
		System.out.println("end : " + end);
		System.out.println("maxLength : " + maxLength);
	}

}