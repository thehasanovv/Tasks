package classtasks.fileread;

import java.io.*;
import java.nio.charset.Charset;

public class FileApp {

    public static final String RESOURCE = "src/classtasks/fileread/source/";

    public static void main(String[] args) {


        try {
            FileOutputStream fos = new FileOutputStream(RESOURCE + "hello.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            bos.write("Hello world".getBytes());

            bos.close();
            fos.close();
            System.out.println("File 'hello.txt' has been written successfully.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            FileInputStream fis = new FileInputStream(RESOURCE + "hello.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            byte[] bytes = bis.readAllBytes();

            //Solution 1
            String str = new String(bytes, Charset.forName("UTF-8"));
            System.out.println("Converted string 2: " + str);

            // Solution 2
            char[] charArray = new char[bytes.length];
            for (int i = 0; i < bytes.length; i++) {
                charArray[i] = (char) bytes[i];
            }

            String str2 = new String(charArray);
            System.out.println("Converted string 2: " + str2);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

