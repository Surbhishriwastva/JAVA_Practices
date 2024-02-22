
import java.util.*;

import javax.sound.sampled.SourceDataLine;
import javax.sql.rowset.spi.SyncResolver;

public class cal {
    public static void main(String[] arg) {
        System.out.println("enter the  operator");
        Scanner n = new Scanner(System.in);
        char oper = n.next().charAt(0);
        System.out.println("enter two no");
        int a = n.nextInt();
        int b = n.nextInt();
        // int a = 10, b = 20;

        if (oper == '+') {
            System.out.println(a + b);
        } else if (oper == '-') {
            System.out.println(a - b);
        } else if (oper == '*') {
            System.out.println(a * b);
        } else if (oper == '/') {
            System.out.println(a / b);
        } else if (oper == '%') {
            System.out.println(a % b);

        } else {
            System.out.println("operator is invalid");

        }

    }

}
