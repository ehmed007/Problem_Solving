
public class printFirstCharacterOfEveryWord {
    public static void main(String[] args) {
        String s = "Hello User!! Welcome";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                if (i == 0) {
                    System.out.println(s.charAt(i));
                }
                else if(s.charAt(i-1) == ' ') {
                    System.out.println(s.charAt(i));
                }
            }
        }
        System.out.println();
    }
}