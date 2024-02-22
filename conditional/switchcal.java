//package conditional;

import java.util.*;

public class switchcal {
    public static void main(String arg[]) {

        // System.out.println("enter the operator day");
        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        int b = n.nextInt();
        // int operator=n.nextInt();

        int w = n.nextInt();
        switch (w) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a / b);
                break;
            case 5:
                System.out.println(a % b);
                break;

            default:
                System.out.println("invalid operator");
        }
        n.close();
    }

}
