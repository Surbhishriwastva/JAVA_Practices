package function;

public class pallindrome {
    public static boolean check_pallindrome(int num) {
        int n = num;
        int reverse = 0;
        while (num > 0) {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;

        }
        if (num == n) {
            return true;
        }
        return false;
    }

    public static void main(String arg[]) {
        int num = 231;

    }

}
