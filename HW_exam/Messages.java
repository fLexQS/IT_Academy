package IT_Academy.HW_exam;

import java.io.*;
import java.util.Scanner;

public class Messages {
    //файл лога
    private final File file;

    public Messages(String path) throws FileNotFoundException {
        this.file = new File(path);
        if (!file.exists()) {FileOutputStream oFile = new FileOutputStream(file, false);}
    }

    public void input(String args) throws IOException {
        FileWriter writer = new FileWriter(file, true);
        writer.write(args+";\n");
        writer.flush();
    }

    public String start() throws FileNotFoundException {
        var builder = new StringBuilder();
        var sc = new Scanner(file);// сканируем файл
        while (sc.hasNext()) {      //считываем пока есть строки
            var str = sc.nextLine();
            String[] mas = str.split(";");
            for (var item : mas) {
                builder.append(item).append(" ");
            }
            builder.append("\n\r");
        }
        sc.close();
        return builder.toString();
    }
}
