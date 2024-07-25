package classtasks.file;

import java.io.*;

public class Main {
    public static final String RESOURCE ="src/classtasks/file/files/";

    public static final File FILE = new File(RESOURCE + "mentor");

    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter(FILE)) {
            fw.write("Ilqar is the best");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try (FileReader fr = new FileReader(FILE)) {
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
