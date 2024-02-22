import java.util.Scanner;

class rev {
    int n;

    // through passing arugment
    // argument wo hota h jispe hmlog ko work perform krna hota h
    // and return final value hota h
    void inputdata(int i) {
        n = i;
        /*
         * Scanner sc = new Scanner(System.in);
         * System.out.println("enter no");
         * n = sc.nextInt();
         */

    }

    int putdata() {
        int rev = 0;
        while (n > 0) {
            rev = (rev * 10) + n % 10;
            n = n / 10;
        }
        // System.out.println("Reverse=" + rev);
        // for making return type commment sout and write return rev
        return (rev);
    }
}

public class reverse {
    public static void main(String[] args) {
        int m, value;

        rev aa = new rev();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        m = sc.nextInt();

        aa.inputdata(m);
        value = aa.putdata();
        // for doing return type write this code (sout)below and stored in a variable

        System.out.println("Reverse=" + value);
    }

}
