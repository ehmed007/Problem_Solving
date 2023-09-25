import java.util.*;

public class longestSubstringWithNoRepeatingCharacters {

    public static void main(String[] args) {
        String str = "babccbacdeb";
        char[] arr = str.toCharArray();
        search(arr);
    }

    public static void search(char[] arr) {
        HashMap<Character,Integer> map = new HashMap<>();
        int start = 0;
        int end = 0;
        while(end < arr.length) {
            if(!map.containsKey(arr[end])) {
                map.put(arr[end], 1);
                end++;
            }
            else {
                if(arr[end] == arr[start]) {
                    start++;
                    end++;
                }
                else {
                    while(!map.isEmpty()) {
                        map.remove(arr[start++]);
                    }
                    end++;
                    start = end;
                }
            }
        }
        for (int i = start; i < end; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println(start);
        System.out.println(end);
        
    }
    
}