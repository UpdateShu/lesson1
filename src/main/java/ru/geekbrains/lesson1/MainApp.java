package ru.geekbrains.lesson1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainApp
{
    public static void main(String[] args) {

        byte byteVal = 127;
        short shortVal = 32767;
        int intVal = -2147483648;
        long longVal = 10000l;
        float floatVal = 123.456f;
        double doubleVal = 123.4555d;
        char charVal = 'Q';
        boolean boolVal = (2 + 2) == 5;

        System.out.println("Hello, World!");

        float a = 1.5f;
        float b = 1.0f;
        float c = 2.6f;
        float d = 1.3f;
        System.out.println(a + " * (" + b + " + " + c + "/" + d + ") = " + Calc1(a, b, c, d));

        int x = 0;
        int y = 15;
        System.out.println("Сумма " + x + " и " + y + (ValidateSum(x, y) ? " лежит" : " не лежит") + " в диапазоне [10, 20]");

        InfoAboutSign(1);

        System.out.println("Число " + x + (ValidateMinus(x) ? " является" : " не является") + " отрицательным");
        Greeting("мой друг");

        ValidateLeapYear((new GregorianCalendar()).get(Calendar.YEAR));
        ValidateLeapYear(1800);
        ValidateLeapYear(1900);
        ValidateLeapYear(2000);
    }

    static float Calc1(float a, float b, float c, float d)
    {
        return d != 0 ? (a * (b + (c / d))) : 0;
    }

    static boolean ValidateSum(int a, int b)
    {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    static void InfoAboutSign(int a)
    {
        System.out.println("Число " + a + " является" + (a >= 0 ? " положительным" : " отрицательным") + " числом");
    }

    static boolean ValidateMinus(int a)
    {
        return a < 0;
    }

    static void Greeting(String name)
    {
        System.out.println("Привет, " + name + "!");
    }

    static void ValidateLeapYear(int year)
    {
        boolean isLeap = year % 100 == 0 ? (year % 400 == 0) : (year % 4 == 0);
        System.out.println("Год " + year + (isLeap ? " является" : " не является") + " високосным");
    }
}


