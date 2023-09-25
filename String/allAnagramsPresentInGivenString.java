import java.util.*;

public class allAnagramsPresentInGivenString {

    public static void main(String[] args) {
        // String str = "bcdcbabcbdxacb";
        
        
        String str = "abccbabc";

        String pattern = "abc";
        search(str.toCharArray(),pattern.toCharArray());
    }

    public static void search(char[] str, char[] pattern) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < pattern.length; i++) {
            if (!map.containsKey(pattern[i])) {
                map.put(pattern[i], 1);
            }
            else {
                map.put(pattern[i], map.get(pattern[i])+1);
            }
        }
        int start = 0;
        int end = pattern.length - 1;
        while (end < str.length) {
            HashMap<Character,Integer> windowMap = new HashMap<>();
            for (int i = start; i <= end; i++) {
                if (!windowMap.containsKey(str[i])) {
                    windowMap.put(str[i],1);
                }
                else {
                    windowMap.put(str[i], windowMap.get(str[i])+1);
                }   
            }
            boolean flag = true;
            for (int i = 0; i < pattern.length; i++) {
                if (map.get(pattern[i]) != windowMap.get(pattern[i])) {
                    flag = false;
                }
            }
            if(flag) {
                for (int i = start; i <= end; i++) {
                    System.out.print(str[i]);
                }   
                System.out.println();
            }
            windowMap.clear();
            start++;
            end++;
        }
    }

}