import java.util.*;

public class backspaceCharacter {

    public static void main(String[] args) {
        String str1 = "bcd##e";
        String str2 = "bd#e";
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        if(check(arr1).equals(check(arr2))) {
            System.out.println("Strings are equal");
        }else {
            System.out.println("Strings are not equal");
        }
    }   
    
    public static String check(char[] arr) {
        Deque<Character> deque = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != '#') {
                deque.addFirst(arr[i]);
            }
            else {
                deque.removeFirst();
            }
        }
        String result = "";
        while (!deque.isEmpty()) {
            result += deque.removeLast();
        }
        return result;
    }
    
}