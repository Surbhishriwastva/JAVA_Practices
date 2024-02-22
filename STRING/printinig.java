package STRING;

import java.util.*;

public class printinig {
    public static void eachcharter() {
        String str2 = "abhishek";
        for (int i = 0; i < str2.length(); i++) {
            System.out.println(str2.charAt(i));
        }

    }

    public static void main(String args[]) {
        // char arr[] = { 'a', 'b', 'c' };
        // System.out.println(arr);
        // String str = "def";
        // System.out.println(str);
        Scanner sc = new Scanner(System.in);
        String firstname = sc.nextLine();

        String lastname = sc.nextLine();
        System.out.println(firstname);
        System.out.println(lastname);
        System.out.println(lastname + firstname);
        System.out.println(lastname.length());
        System.out.println(lastname.length() + firstname.length());
        System.out.println(firstname.charAt(1));
        eachcharter();

    }

}
