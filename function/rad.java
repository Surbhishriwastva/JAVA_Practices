package function;

import java.util.*;;

public class rad {
    public static int calarea(int r) {
        // int area = 2* 3.14 *r;
        // return (area);
        if (r > 18) {
            return true;

        } else {
            return false;
        }
    }

    public static void main(String arg[]) {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        System.out.print(calarea(r));

    }

}
