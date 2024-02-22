
import java.util.*;

public class adult {

    public static void main(String[] arg) {
        System.out.println("enter the age");
        Scanner n = new Scanner(System.in);
        int age = n.nextInt();
        if (age > 18) {

            System.out.println("adult");
        } else {
            System.out.println("not adult1");
        }

    }

}
