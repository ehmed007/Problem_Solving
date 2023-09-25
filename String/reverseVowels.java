import java.util.*;

public class reverseVowels {

    public static void main(String[] args) {
        String str = "equation";
        reverse(str.toCharArray());
    }

    public static void reverse(char[] arr) {
        String s = "aeiou";
        char vowels[] = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < vowels.length; i++) {
            map.put(vowels[i], 1);
        }

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if(map.containsKey(arr[i]) && map.containsKey(arr[j])) {
                char x = arr[i];
                arr[i] = arr[j];
                arr[j] = x;
                i++;
                j--;
            }
            else {
                if (map.containsKey(arr[i])) {
                    j--;
                }
                else {
                    i++;
                }
            }
        }

        for (int j2 = 0; j2 < arr.length; j2++) {
            System.out.print(arr[j2]);
        }
        System.out.println();
    }
}