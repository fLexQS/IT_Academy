package IT_Academy.HW_12;
/*
 * Использовать один объект String Builder для
 * отображения двух матриц – исходной и возведенной в степень равную номеру
 * строки. Дозаписать в файл полученную матрицу.
 */

import java.io.*;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        var file = new File("demo.txt");
        if (!file.exists()) {FileOutputStream oFile = new FileOutputStream(file, false);}
        FileWriter writer = new FileWriter(file, true);
        var builder = new StringBuilder();
        var sc = new Scanner(file);
        boolean noSkip = true;
        var i = 1;
        writer.write("\n------------------------\n");
        while (sc.hasNext()){
            var str = sc.nextLine();
            if (str.equals("\n------------------------")) noSkip = false;
            builder.append(str).append("\n");
            String[] mas = str.split(" ");
            if (noSkip) for(var item : mas){
                writer.write((int) Math.pow(Integer.parseInt(item), i) +"\t");
            }
            writer.write("\n");
            i++;

        }
        System.out.println(builder);
        sc.close();
        writer.flush();
    }
}

