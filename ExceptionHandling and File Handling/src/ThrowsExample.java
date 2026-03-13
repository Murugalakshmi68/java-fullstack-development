import java.io.*;

public class ThrowsExample {

    static void readFile() throws IOException {
        FileReader file = new FileReader("sample.txt");
        int data = file.read();
        System.out.println((char)data);
        file.close();
    }

    public static void main(String[] args) {
        try {
            readFile();
        } 
        catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
