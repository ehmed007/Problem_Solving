
public class reverseIndividualWords {
    public static void main(String[] args) {
        String s = "Coding Simplified nice";
        // String s = "Cod Simp ni";

        System.out.println(s);
        char[] arr = s.toCharArray();
        
        int i = 0;
        int j = 0;

        while (j < arr.length) {
            if(arr[j] != ' ') {
                j++;
            }
            else {
                for (int k = 0; k < (j-i)/2; k++) {
                    char x = arr[k+i];
                    arr[k+i] = arr[j-1-k];
                    arr[j-1-k] = x;
                }
                i = ++j;
            }
            if(j == arr.length) {
                for (int k = 0; k < (j-i)/2; k++) {
                    char x = arr[k+i];
                    arr[k+i] = arr[j-1-k];
                    arr[j-1-k] = x;
                }
            }
        }
        for (int j2 = 0; j2 < arr.length; j2++) {
            System.out.print(arr[j2]);
        }
        System.out.println();

    }

}