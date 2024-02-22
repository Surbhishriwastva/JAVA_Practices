//package conditional;

import java.util.*;

public class week {
    public static void main(String[] arg) {
        System.out.println("enter the wekend day");
        Scanner n = new Scanner(System.in);
        int w = n.nextInt();
        switch (w) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturaday");
                break;
            default:
                System.out.println("sunday");
        }
    }

}
