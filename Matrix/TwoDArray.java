import java.util.*;

public class TwoDArray {
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
		search(arr, 10);	
	}

	// Time Complexity is O(m+n) and space is O(1)
	// Matrix is sorted row wise and column wise
	public static void search(int[][] arr, int givenValue) {
		int rows = arr.length;
		int columns = arr[0].length;
		int i = 0;
		int j = columns - 1;
		while(i < arr.length && j >= 0) {
			if (arr[i][j] == givenValue) {
				System.out.println("i : " + i + " j : " + j);
				break;
			}
			else if(arr[i][j] > givenValue) {
				j--;
			}
			else if(arr[i][j] < givenValue) {
				i++;
			}
		}
		System.out.println("Given Value does not exist in Matrix");
	}
}