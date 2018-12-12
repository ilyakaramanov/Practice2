package ua.org.oa.ilyakaramanov;


import java.time.Month;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {
        int day = 0;
        double sum = 0.0;

        System.out.println("Введите название месяца на английском:");
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);     //локация для ввода температуры через точку, а не запятую
        String month = scanner.nextLine().toUpperCase();

        try {                                                              //считываем название месяца
            Month date = Month.valueOf(month);
            day = date.minLength();
        } catch (Exception e) {
            System.out.println("Введите название месяца правильно!");
            return;
        }
        System.out.println(day);

        ArrayList<Double> temperature = new ArrayList<>();

        System.out.println("Введите показания температуры");

        for (int i = 0; i < day; i++) {                                 //добавляем температуру
            temperature.add(scanner.nextDouble());
        }

        for (double temp : temperature) {
            sum += temp;
        }

        double averageTemp = sum / day;                                 //высчитываем среднюю температуру
        double maxTemp = temperature.get(0);
        int maxDay = 0;
        double minTemp = temperature.get(0);
        int minDay = 0;


        for (int i = 0; i < temperature.size(); i++) {
            if (maxTemp < temperature.get(i)) {
                maxTemp = temperature.get(i);
                maxDay = i + 1;
            }
            if (minTemp > temperature.get(i)) {
                minTemp = temperature.get(i);
                minDay = i + 1;
            }

        }

        System.out.println("Среднемесячная температура: " + averageTemp + " градусов по Цельсию.");
        System.out.println("Максимальна температура " + maxTemp + " градусов. Была зафиксирована " + maxDay + " числа.");
        System.out.println("Минимальная температура " + minTemp + " градусов. Была зафиксирована " + minDay + " числа.");
    }

}







