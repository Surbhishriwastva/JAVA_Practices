package ARRAYS;

public class linearsear {
    public static int line_ser(int marks[], int search) {
        for (int i = 0; i < marks.length; i++) {

            if (marks[i] == search)

            {
                return i;
            }
        }
        return -1;

    }

    public static void main(String arg[]) {
        int marks[] = { 3, 5, 10, 1, 9 };
        int search = 10;
        int index = line_ser(marks, search);
        if (index == -1) {
            System.out.println("not found");
        } else {
            System.out.println("found");
        }

    }

}
