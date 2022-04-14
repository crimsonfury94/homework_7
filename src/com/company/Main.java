package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 1" + "\n");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        System.out.println("\n" + "Задание 2" + "\n");

        String litUp = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + litUp);

        System.out.println("\n" + "Задание 3" + "\n");

        int fullNameLength = fullName.length();
        //System.out.println(fullNameLength); // для проверки длины сторки; что бы использовать этот интервал для преобразования данных в строке;
        StringBuilder fullName2 = new StringBuilder(fullName);
        fullName2.replace(0, 21, "Иванов Семён Семёнович");
        String result = fullName2.toString();
        System.out.println("Данные ФИО сотрудника - " + result.replace("ё", "е"));

    }
}
