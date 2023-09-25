import java.util.*;

public class minimumTimeToRotAllOranges {
	public static void main(String[] args) {
		int[][] arr = { 
        { 0, 2, 0, 0, 2 },
        { 0, 1, 0, 1, 1 },
        { 0, 1, 0, 1, 2 },
        { 2, 1, 0, 2, 0 }};

        int times = 0;

        while(isOneExist(arr)) {
        	HashMap<Integer,HashMap<Integer,Integer>> result = getTwosIndexes(arr);
        	for (int i = 0; i < result.size(); i++) {
        		HashMap<Integer,Integer> x = result.get(i);
        		doRottan(arr,x.get(0),x.get(1));
        	}
        	for (int k = 0; k < arr.length; k++) {
        		for (int j = 0; j < arr[0].length; j++) {
        			System.out.print(arr[k][j] + ", ");
        		}
       			System.out.println();
       		}
       		System.out.println();
        	times++;
        }
        System.out.println("Total Number of Times : " + times);
	}

	public static boolean isSafe(int[][] arr, int i, int j) {
		return i >= 0 && j >= 0 
		&& i < arr.length && j < arr[0].length 
		&& arr[i][j] == 1; 
	}
	
	public static boolean isOneExist(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
        	for (int j = 0; j < arr[0].length; j++) {
        		if (arr[i][j] == 1) {
        			return true;
        		}
        	}
        }
        return false;
	}

	public static HashMap<Integer,HashMap<Integer,Integer>> getTwosIndexes(int[][] arr) {
		HashMap<Integer,HashMap<Integer,Integer>> result = new HashMap<>();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
        	for (int j = 0; j < arr[0].length; j++) {
        		if (arr[i][j] == 2) 	{
        			HashMap<Integer,Integer> x = new HashMap<>();
        			x.put(0,i);
        			x.put(1,j);
        			result.put(count++,x);	
        		}
        	}
        }
        return result;
	}

	public static void doRottan(int[][] arr, int i, int j) {
		if (isSafe(arr,i-1,j)) {
			arr[i-1][j] = 2;
		}
		if (isSafe(arr,i,j-1)) {
			arr[i][j-1] = 2;	
		}
		if (isSafe(arr,i,j+1)) {
			arr[i][j+1] = 2;
		}
		if (isSafe(arr,i+1,j)) {
			arr[i+1][j] = 2;
		}
	}

}