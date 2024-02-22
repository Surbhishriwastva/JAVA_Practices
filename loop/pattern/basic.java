package loop.pattern;

import java.util.*;

public class basic {
    public static void main(String[] args) {
        System.out.println("enter size of n");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        // 1****************************************************
        // int n = 4;
        // int m = 5;
        // solid rectangle
        /*
         * for (int i = 1; i <= n; i++) {
         * for (int j = 1; j <= m; j++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         * 
         * //2......................................................................
         * for (int i = 1; i <= 4; i++) {
         * for (int j = 1; j <= 3; j++) {
         * if (i == 1 || i == 4 || j == 1 || j == 3) {
         * System.out.print("*");
         * } else {
         * System.out.print(" ");
         * }
         * 
         * }
         * System.out.println();
         * }
         * 
         * }
         * }
         * 
         * // 3 half*************************************************
         * /*
         * for (int i = 1; i <= n; i++) {
         * for (int j = 1; j <= i; j++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * 
         * }
         * }
         * }
         */
        // 4 reverse********************************************
        // for (int i = 1; i <= n; i++) {
        // for (int j = n; j >= i; j--) {
        // System.out.print("*");

        // }
        // System.out.println();
        // }
        // }
        // }
        // 5 space *****************************************************
        // for (int i = 0; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // }
        // }
        // 6 no****************************************************************
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }
        // }
        // }
        // 7 rev no***********************************************************
        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);

        // }
        // System.out.println();
        // }
        // }
        // }
        // 8 sum *******************************************************
        // int num = 1;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(num + " ");
        // num++;

        /// }
        // System.out.println();

        // }
        // }
        // }
        // 9 odd even***************************************************************
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // if ((i + j) % 2 == 0) {
        // System.out.print(1 + " ");
        // }
        // else {
        // System.out.print(0 + " ");
        // }
        // }
        // System.out.println();
        // }
        // }
        // 10**************************************************************************
        // for (int i = 1; i <= n; i++) { // upper part
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // } // for space
        // int spaces = 2 * (n - i);
        // for (int j = 1; j <= spaces; j++) {
        // System.out.print(" ");
        // }
        // 2nd part
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // }
        // lower part
        // for (int i = n; i >= n; i--) { // 1st part
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // } // for space
        // int spaces = 2 * (n - i);
        // for (int j = 1; j <= spaces; j++) {
        // System.out.print(" ");
        // }
        // 2nd part
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // }
        // }
        // }
        // 11
        // ********************************************************************************************
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= (n - i); j++) {
        // System.out.print(" ");
        //// }
        // for (int j = 1; j <= 5; j++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // }

        // }
        // }
        // 12.***********************************************************************************************************
        /*
         * for (int i = 1; i <= n; i++) {
         * for (int j = 1; j <= (n - i); j++) {
         * System.out.print(" ");
         * }
         * for (int j = 1; j <= i; j++) {
         * System.out.print(i + " ");
         * }
         * System.out.println();
         * }
         * }
         * }
         */
        // 13.********************************************************************************************
        /*
         * for (int i = 1; i <= n; i++) {
         * for (int j = 1; j <= (n - i); j++) {
         * System.out.print(" ");
         * }
         * for (int j = i; j >= 1; j--) {
         * System.out.print(j);
         * }
         * for (int j = 2; j <= i; j++) {
         * System.out.print(j);
         * }
         * System.out.println();
         * }
         * }
         * }
         */
        // 14.***************************************************************************************************
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");

            }

        }
    }
}
