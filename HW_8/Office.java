package IT_Academy.HW_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class Office {
    private BufferedReader reader;
    private ArrayList<Number_plate> plates;
    private String series;
    private static Random rnd = new Random();
    private static final String LITTERS = "АВЕКМНОРСТУХ";

    /**
     *
     * @param count - количество паспортов, которые необходимо изготовить
     */

    public Office(int count) throws IOException {
        reader = new BufferedReader(new InputStreamReader(System.in));
        plates = new ArrayList<Number_plate>();
        createSeries();
        while (count > 0){
            String number = generateNumber(3);
            String region = generateNumber(3);
            if(checkPlateOnDuplicate(series,number,region) != null){
                System.out.println("Дубликат!");
                continue;//пропускаем дубликат, то есть в коллекцию не добавится
            }else {
                System.out.printf("Введите имя владельца ГРЗ серия и номер %s%s%s регион %s\n\r", series.substring(0,1), number, series.substring(1,3),region);
                var owner = reader.readLine();
                var plate = new Number_plate(series,number,region, owner);
                plates.add(plate);
            }
            count--;
        }
    }

    private void createSeries() throws IOException {
        System.out.println("Серию создаем автоматически(а) или вручную(р)");
        var answer = reader.readLine();
        if(answer.equalsIgnoreCase("р")){
            System.out.println("Введите серию в формате NNN");
            var series = reader.readLine();
            this.series = series;
        }else if(answer.equalsIgnoreCase("а")){
            series = generateSeries(3);
        }
        System.out.println("Серия ГРЗ " + series);
    }

    /**
     * Метод генерирует рандомное число из count цифр
     * @param count - сколько цифр должно быть в исходном числе
     * @return
     */
    private static String generateNumber(int count){
        var builder = new StringBuilder();
        for(var i = 0;i < count;i++){
            builder.append(rnd.nextInt(9));
        }
        return builder.toString();
    }

    /**
     * Метод генерирует рандомные count букв
     * @param count - сколько букв должно быть в исходном числе
     * @return
     */
    private static String generateSeries(int count){
        var builder = new StringBuilder();
        for(var i = 0;i < count;i++){
            builder.append(LITTERS.charAt(rnd.nextInt(LITTERS.length()-1)));
        }
        return builder.toString();
    }

    /**
     * Проверка на уникальность
     * @param series - серия (вида ААА)
     * @param number - номер (вида 111)
     * @param region - регион (вида 111)
     * @return возвращает имя владельца, если такой ГРЗ уже существует
     */
    String checkPlateOnDuplicate(String series, String number, String region){
        for(var plate : plates){
            if(plate.getSeries().equals(series) && plate.getNumber().equals(number) && plate.getRegion().equals(region)){
                return plate.getOwner();
            }
        }
        return null;//если после поиска дубликата, он не найден, то вернем null
    }

    void showFioByNumberAndSeries() throws IOException {
        for(;;){
            System.out.println("Введите серию, номер и регион номерного знака через пробел или STOP");
            var str = reader.readLine();//получили серию и номер паспорта
            if(str.equalsIgnoreCase("Stop")){
                break;
            }
            String inputData[] = str.split(" ");
            var fio = checkPlateOnDuplicate(inputData[0],inputData[1],inputData[2]);
            System.out.println(fio != null ? fio : "Номер не найден");
        }
    }

    public static void main(String[] args) throws IOException {
        var office = new Office(3);
        office.showFioByNumberAndSeries();
    }
}
