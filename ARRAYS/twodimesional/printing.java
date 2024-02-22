
package ARRAYS.twodimesional;

import java.util.*;

public class printing {
    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        // int n = matrix.length, m = matrix[0].length;
        int n = 3, m = 3;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();

            }
        }
        // printing
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

}
