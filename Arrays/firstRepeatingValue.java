import java.util.*;

public class firstRepeatingValue {
	public static void main(String[] args) {
		int  arr[] = {2,3,4,4,3,5,7,2};
		System.out.println(search(arr));
	}
	// complexity is O(n)
	public static int search(int[] arr) {
		HashSet<Integer> set = new HashSet<Integer>();
		int firstRepeat = -1;	
		for (int i = arr.length-1; i >= 0; i--) {
			if(set.contains(arr[i])) {
				firstRepeat = arr[i];
			} else {
				set.add(arr[i]);
			}
		}	
		return firstRepeat;
	}	

}