public class Dynamic {
    private int arr[];
    private int count;

    public Dynamic(int length) {
        arr = new int[length];
    }

    public void printArray() {
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void insert(int element) {
        if (arr.length == count) {
            int newArrr[] = new int[2 * count];
            for (int i = 0; i < count; i++) {
                newArrr[i] = arr[i];
            }

            arr = newArrr;
        }
        arr[count++] = element;
    }

    public static void main(String[] args) {
        Dynamic obj = new Dynamic(3);
        obj.insert(3);
        obj.insert(5);
        obj.insert(4);

        obj.insert(34);
        obj.insert(23);

        obj.printArray();
    }
}
