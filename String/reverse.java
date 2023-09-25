

public class reverse {
    public static void main(String[] args) {
        String s = reverseWords("i am good");
        System.out.println(s);
    }

    public static String reverseWords(String str) {
        String finalStr = "";
        String tempStr = "";
    
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
    
            if (c == ' ') {
                finalStr = " " + tempStr + finalStr;
                tempStr = "";
            } else {
                tempStr = tempStr + c;
            }
        }
    
        finalStr = tempStr + finalStr;
    
        return finalStr;
    }
}