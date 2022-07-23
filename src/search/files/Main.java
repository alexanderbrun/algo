package search.files;

import java.io.File;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Alex\\Dropbox");
        searchJpg(file);
    }

    private static void searchJpg(File file) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File value : files) {
                    searchJpg(value);
                }
            }
        } else {
            String fileName = file.getName();
            if (fileName.toLowerCase(Locale.ROOT).endsWith(".jpg")) {
                System.out.println(fileName);
            }
        }
    }
}
