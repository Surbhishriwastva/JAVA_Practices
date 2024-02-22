//package Filehandling;

import java.io.*;

public class filecoping {
    public static void main(String[] args) throws IOException {
        FileInputStream r = new FileInputStream("c:\\Users\\Surbhi Shriwastva\\OneDrive\\Desktop\\JAVA\\surbhi.txt");

        FileOutputStream w = new FileOutputStream("c:\\Users\\Surbhi Shriwastva\\OneDrive\\Desktop\\JAVA\\file1.txt");
        int i;
        while ((i = r.read()) != -1) {
            w.write((char) i);

        }
        System.out.println("data copied");
    }

}
