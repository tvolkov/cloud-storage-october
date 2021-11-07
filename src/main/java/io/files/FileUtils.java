package io.files;

import java.io.*;

public class FileUtils {
    public static void main(String[] args) {
        File file = new File("1.jpg");
        System.out.println(file.exists());
        File copy = new File("copy.jpg");
        System.out.println(copy.exists());

        byte[] buffer = new byte[256];
        try (FileInputStream is = new FileInputStream(file);
             FileOutputStream os = new FileOutputStream(copy)) {
            int read;
            while ((read = is.read(buffer)) != -1) {
                os.write(buffer, 0, read);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
