import java.util.*;

public class CheckCycleInArray {
	public static void main(String[] args) {
		int arr[] = {2,-1,1,2,-1};
		int arr1[] = {-2,-1,1,-2,-1};
		int arr3[] = {2,1,-1,1};
		check(arr);
		check(arr1);
	}

	public static void check(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int start = i;
			int count = 0;
			if (arr[i] > 0) {
				while(true) {
					if(count == arr.length) {
						System.out.println("Cycle Exist! "+arr[start] + " Index : " + start);
						// return;
						break;
					}
					if(arr[start] > 0) {
						if(start + arr[start] > arr.length-1) {
							start += arr[start];
							start = start - arr.length;
							count += arr[start];
						} else {
							start += arr[start];
							count += arr[start];
						}
					} else {
						// return;
						break;
					}
				}	
			}
			else if (arr[i] < 0) {
				while(true) {
					if(count == arr.length) {
						System.out.println("Cycle Exist! " + arr[start] + " Index : " + start);
						// return;
						break;
					}
					if(arr[start] < 0) {
						if(start + arr[start] < 0) {
							start += arr[start];
							start = arr.length + start;
							count += Math.abs(arr[start]);
						} else {
							start += arr[start];
							count += Math.abs(arr[start]);
						}
					} else {
						// return;
						break;
					}
				}	
			}
		}
	}
}