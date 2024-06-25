package classtasks;

import java.io.*;
import java.util.zip.*;

public class ZipFiles {
    public static void main(String[] args) {
        String[] srcFiles = {"C:\\Users\\Dreamist\\Downloads\\Java_Enum_Details_Part1.txt"
                , "C:\\Users\\Dreamist\\Downloads\\Java_Enum_Details_Part2.txt"};
        String zipFileName = "C:\\Users\\Dreamist\\Downloads\\Java_Enum_Details.zip";

        try (FileOutputStream fos = new FileOutputStream(zipFileName);
             ZipOutputStream zos = new ZipOutputStream(fos)) {

            for (String srcFile : srcFiles) {
                File fileToZip = new File(srcFile);
                try (FileInputStream fis = new FileInputStream(fileToZip)) {
                    ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
                    zos.putNextEntry(zipEntry);

                    byte[] bytes = new byte[1024];
                    int length;
                    while ((length = fis.read(bytes)) >= 0) {
                        zos.write(bytes, 0, length);
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
