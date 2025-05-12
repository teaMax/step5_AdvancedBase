package topic2_Exceptions.task3_FileNotFoundException;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFound {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("e:/Text.java");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
