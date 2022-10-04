package lesson4.University;

import java.io.File;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        File papka = new File("D:\\File");
        File[] spisok = papka.listFiles();
        assert spisok != null;
        for(File file : spisok)
        {
            if (file.getName().matches("(.*).jpg")) {
                System.out.println("имя:" + file.getName());
                System.out.println("путь:" + file);
            }
        }
    }
}