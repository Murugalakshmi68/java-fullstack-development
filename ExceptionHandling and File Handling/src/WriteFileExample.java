import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("sample.txt");
            writer.write("Hello Java File Handling");
            writer.close();

            System.out.println("File written successfully");
        } 
        catch (IOException e) {
            System.out.println("Error occurred");
        }
    }
}
