package IT_Academy.HW_12;
/*
 * Использовать один объект String Builder для
 * отображения двух матриц – исходной и возведенной в степень равную номеру
 * строки. Дозаписать в файл полученную матрицу.
 */

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        var file = new File("src/IT_Academy/HW_12/demo.txt");
        if (!file.exists()) {FileOutputStream oFile = new FileOutputStream(file, false);}
        FileWriter writer = new FileWriter(file, true);
        var builder = new StringBuilder();
        var sc = new Scanner(file);// сканируем файл
        var i = 1;
        while (sc.hasNext()) {      //считываем пока есть строки
            var str = sc.nextLine();
            System.out.println(str);
            String[] mas = str.split(" ");
            for (var item : mas) {
                writer.write((int) Math.pow(Integer.parseInt(item), i) + "\t");
                builder.append((int) Math.pow(Integer.parseInt(item), i)).append("\t");
            }
            writer.write("\n");
            builder.append("\n");
            i++;
        }
        writer.flush();
        sc.close();
        System.out.println(builder);
    }
}

