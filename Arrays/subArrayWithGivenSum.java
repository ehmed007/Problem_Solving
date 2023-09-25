import java.util.*;

public class subArrayWithGivenSum {
	public static void main(String[] args) {
		int arr[] = {4, 2, 0, 0, 3, 10, 5};
		int arr1[] = {-3, -1, -1, 5, 8};
		int arr2[] = {3,2,5,5,3,2,10};
		findSubArray(arr,-2);
	}

	// only for positive numbers O(n)
	public static void search(int[] arr, int sum) {
		int start = 0;
		int end = 1;
		int value = arr[0];
		while(start <= end) {
			if (value + arr[end] == sum) {
				System.out.println(start+" "+end);		
				return;		
			}
			if (value + arr[end] < sum) {
				value += arr[end];
				end++;
			} else {
				if (start == end) {
					value += arr[start];
					end++;
				}		
				else {
					value -= arr[start];
					start++;	
				}		
			}
		}
		System.out.println("sum does not exist!");
	}

	// Complexity is O(n)
    public static void findSubArray(int[] arr, int sum) {
    	if (arr.length == 0) {
      		System.out.println("Array is empty");
      		return;
    	}

    	int end, totalSumTillNow;
    	end = 0;
    	totalSumTillNow = 0;
    
    	Map<Integer, Integer> map = new HashMap<>();

    	int min = Integer.MAX_VALUE;

    	while (end < arr.length) {
      		totalSumTillNow = totalSumTillNow + arr[end];

      		if (totalSumTillNow == sum) {
        		System.out.println("Start Index: " + 0 + ", End Index: " + end);
        		min = Math.min(min, end+1);
        		// return;
      		}
      
      		int windowSum = totalSumTillNow - sum;
      
      		if(map.containsKey(windowSum)) {
        		int start = map.get(windowSum);
        		System.out.println("Start Index: " + (start + 1) + ", End Index: " + end);
        		min = Math.min(min, end - start);
        		// return;
      		} 
      		map.put(totalSumTillNow, end++);
    	}
    	if (min != Integer.MAX_VALUE) {
    		System.out.println("This is for minimum length subarray : " + min);	
    	} else {
    		System.out.println("No SubArray Exist!");
    	}
    	
  	}
}