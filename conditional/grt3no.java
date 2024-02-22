
import java.util.*;

public class grt3no {
    public static void main(String[] arg) {
        System.out.println("enter three no");
        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        int b = n.nextInt();
        int c = n.nextInt();
        if (a > b) {
            System.out.println("a is greater");
        } else if (b > c) {
            System.out.println("b is greater");
        } else {
            System.out.println("c is greater");
        }

    }

}
