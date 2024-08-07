package classtasks.fileread;


import java.io.*;

public class PersonApp {
    public static final String RESOURCE = "src/classtasks/fileread/source/";

    public static void main(String[] args) {
        Person person = new Person(1, "ELnur", 25, "123456");

        writeObjToFile(person);
        readObjFromFile();
    }

    private static void writeObjToFile(Object object) {
        try (FileOutputStream fis = new FileOutputStream(RESOURCE + "person.txt");
             ObjectOutputStream ois = new ObjectOutputStream(fis)) {
            ois.writeObject(object);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void readObjFromFile() {
        try  {
            FileInputStream fis = new FileInputStream(RESOURCE + "person.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object object = ois.readObject();

            System.out.println(object);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
