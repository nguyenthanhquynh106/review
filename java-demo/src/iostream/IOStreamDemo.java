package iostream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IOStreamDemo {
    public static void main(String[] args) {
        try {
            File f = new File("mydata.txt");
            FileWriter fw = new FileWriter(f);

            fw.write("Ghi dữ liệu bằng luồng character");

            fw.close();
        } catch (IOException ex) {
            System.out.println("Loi ghi file: " + ex);
        }
    }
}
