package STRING;

public class strfunction {
    public static void main(String args[]) {
        String str = "hello world";
        // printing the element by index
        System.out.println(str.substring(0, 5));

        // for compare
        // String s1 = "girls";
        // String s2 = "boys";
        // if (s1.equals(s2)) {
        // System.out.println("equal");
        // } else {
        // System.out.println("not");

        // }

        // largest string
        // String fruit[] = { "apple", "mango", "banana" };
        // String largest = fruit[0];
        // for (int i = 1; i < fruit.length; i++) {

        // if (largest.compareTo(fruit[i]) < 0) {
        // largest = fruit[i];
        // }
        // }
        // System.out.println(largest);
        // }

        // string builder
        StringBuilder sb = new StringBuilder(" ");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);

        }
        System.out.println(sb);
    }
}
