public class reverseNumber {

    public static void main(String[] args) {
        reverse(3);
        System.out.println(factorial(5));
    }

    public static void reverse(int n) {
        System.out.println((n*(n+1))/2);
        // int count = 0;
        // while(n > 9) {
        //     n -= 10;
        //     count++;
        // }
        // System.out.println(n);
        // System.out.println(count);
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n*factorial(n-1);
    }
}