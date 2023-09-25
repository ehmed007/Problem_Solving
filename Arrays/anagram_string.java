import java.util.*;

public class anagram_string {
	public static void main(String[] args) {
		String str1 = "geeksforgeeks";
		String str2 = "forgetfulness";
		String str3 = "hello";
		String str4 = "hallu";
		System.out.println(check(str1, str2));
		System.out.println(check(str3, str4));
	}

	// n + n + n = 3n => O(n) linear growth
	// Time complexity is big O(n) using Hashing
	public static boolean check(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str1.length(); i++) {
			if(map.containsKey(str1.charAt(i))){
				map.put(str1.charAt(i), map.get(str1.charAt(i)) + 1);
			}
			else {
				map.put(str1.charAt(i),1);
			}
		}

		for (int i = 0; i < str2.length(); i++) {
			if(map.containsKey(str2.charAt(i))){
				map.put(str2.charAt(i), map.get(str2.charAt(i)) - 1);
			}
			else {
				return false;
			}
		}		

		for (int i = 0; i < str1.length(); i++) {
			if (map.get(str1.charAt(i)) != 0) {
				return false;
			}
		}
		
		return true;
	}

}