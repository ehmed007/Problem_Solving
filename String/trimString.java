
public class trimString {
    public static void main(String[] args) {
        String s = "    Hello    User   welcome      ";
        char arr[] = s.toCharArray();
        
        int i = 0;
        int j = arr.length - 1;
        boolean flag1 = true;
        boolean flag2 = true;

        while(flag1 || flag2) {
            if(arr[i] != ' ') {
                flag1 = false;
            }
            if(arr[j] != ' ') {
                flag2 = false;
            }

            if(arr[i] == ' ' && arr[j] == ' ') {
                i++;
                j--;
            }
            else {
                if(arr[i] == ' ') {
                    i++;
                }
                if(arr[j] == ' ') {
                    j--;
                }
            }
        }
        while(i <= j) {
            System.out.print(arr[i++]);
        }
        System.out.println();
    }
}