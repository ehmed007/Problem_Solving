import java.util.*;

public class convertZeroToOne {
	public static void main(String[] args) {
		int[][] mat = { 
        { 0, 1, 0, 0, 1 },
        { 1, 1, 0, 0, 0 },
        { 1, 0, 0, 1, 1 },
        { 0, 0, 0, 0, 0 },
        { 1, 0, 0, 0, 1 } };
        // int[][] mat = { 
        // { 0, 0, 0, 0, 1 },
        // { 0, 0, 1, 0, 0 },
        // { 0, 1, 1, 1, 0 },
        // { 0, 1, 0, 0, 0 },
        // { 1, 0, 0, 0, 1 } };

        int count = 0;

        for (int i = 0; i < mat.length; i++ ) {
        	for (int j = 0; j < mat[0].length; j++) {
        		if (mat[i][j] == 1) {
     	    		convert(mat,i,j);
     	    		count++;
        		}
        	}
        }

        System.out.println("Total Number of islands : " + count);

        for (int i = 0; i < mat.length; i++) {
        	for (int j = 0; j < mat[0].length; j++) {
        		System.out.print(mat[i][j] + ", ");
        	}
        	System.out.println();
        }


	}

	public static boolean isSafe(int[][] arr, int i, int j) {
		return i >= 0 && j >= 0 
		&& i < arr.length && j < arr[0].length 
		&& arr[i][j] == 1; 
	}

	public static void convert(int[][] arr, int i, int j) {
		arr[i][j] = 0;
		if (isSafe(arr,i-1,j)) {
			convert(arr,i-1,j);
		}
		if (isSafe(arr,i,j-1)) {
			convert(arr,i,j-1);
		}
		if (isSafe(arr,i,j+1)) {
			convert(arr,i,j+1);
		}
		if (isSafe(arr,i+1,j)) {
			convert(arr,i+1,j);
		}

		if (isSafe(arr,i-1,j-1)) {
			convert(arr,i-1,j-1);
		}
		if (isSafe(arr,i-1,j+1)) {
			convert(arr,i-1,j+1);
		}
		if (isSafe(arr,i+1,j-1)) {
			convert(arr,i+1,j-1);
		}
		if (isSafe(arr,i+1,j+1)) {
			convert(arr,i+1,j+1);
		}
	}


}