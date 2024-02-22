//package Filehandling;

import java.io.*;

public class fileread {
    public static void main(String[] args) {
        try {
            FileReader r = new FileReader("c:\\Users\\Surbhi Shriwastva\\OneDrive\\Desktop\\JAVA\\file1.txt");
            try {
                int i;
                while ((i = r.read()) != -1) {
                    System.out.print((char) i);
                }

            } finally {
                r.close();
                System.out.println("file closed");
            }
        } catch (IOException e) {
            System.out.println("exceptiom handled");
        }
    }

}
