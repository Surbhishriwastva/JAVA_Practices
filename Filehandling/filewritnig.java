import java.io.*;

public class filewritnig {
    public static void main(String[] args) {
        try {
            FileWriter f = new FileWriter("c:\\Users\\Surbhi Shriwastva\\OneDrive\\Desktop\\JAVA\\file1.txt");
            try {
                f.write("java is best languages that  i am currently study");
            } finally {
                f.close();
            }
            System.out.println("sucessfully datawrite in file");
        } catch (IOException i) {
            System.out.print(i);
        }
    }
}
