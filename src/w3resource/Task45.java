package w3resource;

import java.io.File;
import java.io.IOException;

public class Task45 {
    // IF YOU TEST THIS TASK PLEASE CHANE FILE PATH
    static final String PATH = "C:\\Users\\Dreamist\\Desktop\\Hello.java";

    public static void main(String[] args) throws IOException {
        File file = new File(PATH);

        if (file.exists() && file.isFile()) {
            System.out.printf("%s : %d bytes", file.getPath(), file.length());

        } else {
            System.out.println("OOPs! The specified file not found.");
        }
    }
}
