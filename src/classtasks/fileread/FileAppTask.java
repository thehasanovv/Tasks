package classtasks.fileread;

import java.io.*;

public class FileAppTask {
    public static final String RESOURCE = "src/classtasks/fileread/source/";

    public static void main(String[] args) {
        writeNumbersToFile();
        sumNumbersFromFile();
    }

    private static void writeNumbersToFile() {
        try {
            FileOutputStream fos = new FileOutputStream(RESOURCE + "numbers.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            for (int i = 1; i <= 10; i++) {
                bos.write((i + " ").getBytes());
            }

            bos.close();
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void sumNumbersFromFile() {

        int sum = 0;

        try {
            FileInputStream fis = new FileInputStream(RESOURCE + "numbers.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            byte[] bytes = bis.readAllBytes();
            String[] byteString = new String(bytes).split(" ");

            for (String str : byteString) {
                int num = Integer.parseInt(str);
                sum += num;
            }
            System.out.println("sum " + sum);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
