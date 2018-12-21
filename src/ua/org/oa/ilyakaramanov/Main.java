package ua.org.oa.ilyakaramanov;

import java.util.Arrays;
import java.util.List;

/*
Класс содержит методы из условия практического занятия №2
 */

public class Main {

    /*
    Метод создает одну строку из двух
     */

    public void task1() {
        String s1 = "Первая";
        String s2 = "Вторая";
        String s3 = s1.substring(1).concat(s2.substring(1));
        System.out.println(s3);
    }

    /*
    Метод оставляет 3 символу у строки
     */

    public void task2() {
        String s1 = "Practice2";
        String s2 = s1.substring(3, 6);
        System.out.println(s2);
    }

    /*
    Метод переносит 2 последних символа в начало строки
     */

    public void task3() {
        String s1 = "Строка";
        String s2 = s1.substring(s1.length() - 2).concat(s1.substring(0, s1.length() - 2));
        System.out.println(s2);
    }

    /*
Метод удваивает символы в строке
     */

    public void task4() {
        String s1 = "qwerty";
        String s2 = "";
        for (int i = 0; i < s1.length(); i++) {
            s2 = s2 + s1.charAt(i) + s1.charAt(i);
        }
        System.out.println(s2);
    }

    /*
    Метод находит нужное вхождение в строке
     */

    public void task5() {
        int count = 0;
        String s1 = "bob is bab rfdbfb";
        for (int i = 0; i < s1.length() - 1; i++) {
            if ((s1.charAt(i) == 'b') && (s1.charAt(i + 2) == 'b')) {
                count++;
            }
        }
        System.out.println(count);
    }

    /*
    Метод удаляет символы рядом стоящие с символом *
     */

    public void task6() {
        String s1 = "Co*mput*er";
        int index = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == '*') {
                index = i;
                s1 = s1.substring(0, index - 1) + s1.substring(index + 2);
            }
        }
        System.out.println(s1);
    }

    /*
    Метод считает слова, которые заканчиваются на a или s
     */

    public void task7() {
        int count = 0;
        String s1 = "dfgja sdfgns lkfga";
        s1.toLowerCase();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == ' ') {
                if (s1.charAt(i - 1) == 'a')
                    count++;
                if (s1.charAt(i - 1) == 's')
                    count++;
            }
        }
        if (s1.endsWith("s") || s1.endsWith("a")) {
            count++;
        }
        System.out.println(count);
    }

    /*
    Метод удаляет все вхождения из первой строки и создает новую строку
     */

    public void task8() {
        String s1 = "qwertyuiop";
        String s2 = "qwer";
        String s3 = s1.replace(s2, "");
        System.out.println(s3);

    }
}


