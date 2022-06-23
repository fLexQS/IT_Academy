import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class GIBDD {
	static String sdf = null;
	public static void main(String[] args) throws NumberFormatException, IOException, ParseException {
		Integer maxAccessSpeed = 60;//макс. разрешенная скорость движения
		Integer speedGrade = 20;//коэффициент штрафа, каждые 20 км/ч штраф увелич. на 500р
		Integer fineGrade = 500;
		Integer dangerSpeed = 180;

		System.out.println("Введите скорость");
		Integer speed = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());

		if(speed>dangerSpeed) {
			System.out.println("Немедленно остановитесь!");
		}
		else if(speed>maxAccessSpeed) {
			Integer overSpeed = speed - maxAccessSpeed;//скорость превышения
			Integer k = overSpeed/speedGrade;//коэффициент превышения скорости
			Integer fine = k * fineGrade;//величина штрафа
			System.out.println("Введите дату превышения в формате DD-MM-YYYY");
			sdf = new BufferedReader(new InputStreamReader(System.in)).readLine();//чтение ввода
			DateFormat dateFormat = new SimpleDateFormat ("dd-MM-yyyy"); //формат даты
			Date date = dateFormat.parse (sdf); //преобразование строки в дату
			if ((System.currentTimeMillis()-date.getTime())/1000/60/60/24 <= 30) //если разница меньше 30 дней то
				System.out.println("Штраф составляет со скидкой 50% "+fine/2); //скидка на штраф
				else System.out.println("Штраф составляет "+fine); //иначе полная стоимость
		}
		else {
			System.out.println("Доброго пути!");
		}
	}

}
