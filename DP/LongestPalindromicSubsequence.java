import java.util.*;

public class LongestPalindromicSubsequence {
	public static void main(String[] args) {
		String a = "abebac";
		System.out.println(search(a,0,a.length()-1));
		lpsBottomUp(a,6);
	}

	public static int search(String str, int i, int j) {
		if(i > j) {
			return 0;
		}
		if(i == j) {
			return 1;
		}
		else if(str.charAt(i) == str.charAt(j)) {
			return 2 + search(str,i+1,j-1);
		}
		else {
			return Math.max(search(str,i+1,j),search(str,i,j-1));
		}
	}

	public static int lpsBottomUp(String str, int n) {
    	int[][] arr = new int[n][n];
    
    	for (int i = 0; i < str.length(); i++) {
      		arr[i][i] = 1;
    	}
      
    	for(int i = n - 2; i >= 0; i--) {
      		for(int j = i + 1; j < n; j++) {
        		if(str.charAt(i) == str.charAt(j)) {
          			arr[i][j] = 2 + arr[i + 1][j - 1];
        		} else {
          			arr[i][j] = Math.max(arr[i + 1][j], arr[i][j - 1]);
        		}
      		}
    	}
    	for (int i = 0; i < n; i++) {
    		for (int j = 0; j < n; j++) {
    			System.out.print(arr[i][j] + " ");
    		}
    		System.out.println();
    	}
    
    	return arr[0][n - 1];
  	}

}