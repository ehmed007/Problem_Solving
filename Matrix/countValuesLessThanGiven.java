import java.util.*;

public class countValuesLessThanGiven {
	public static void main(String[] args) {
		int[][] arr = {
            {2, 7, 15}, 
            {4, 9, 19}, 
            {6, 10, 24},
            {11, 22, 44}, 
        };
        for (int i = 0; i < arr.length; i++) {
        	for (int j = 0; j < arr[0].length; j++) {
        		System.out.print(arr[i][j] + " ");
       		}
        	System.out.println();
        }
		count(arr, 42);	
	}

	// Matrix is sorted row wise and column wise
	public static void count(int[][] arr, int givenValue) {
		int rows = arr.length;
		int columns = arr[0].length;
		int i = 0;
		int j = columns - 1;
		int count = 0;
		while(i < arr.length && j >= 0) {
			if(arr[i][j] <= givenValue) {
				count = count + j + 1;
				i++;
			}
			else {
				j--;
			}
		}
		System.out.println("Count : "+ count);
	}
}