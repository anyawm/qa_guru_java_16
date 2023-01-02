package stud.anna;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // массивы
        int[] intArr0 = new int[]{1, 42, -100};
        int[] intArr = new int[3];
        intArr0[0] = 1;
        intArr0[1] = 42;
        intArr0[2] = -100;

        System.out.println("Длина массива: " + intArr0.length);
        System.out.println("Массив: " + Arrays.toString(intArr0));

        for (int i = 0; i < intArr0.length; i++) {
            System.out.println(i + "-й элемент массива: " + intArr0[i]);
        }
// в обратную сторону
        for (int i = intArr0.length - 1; i >= 0; i--) {
            System.out.println(i + "-й элемент массива: " + intArr0[i]);
        }
// прерывание цикла
        for (int i = 0; i < intArr0.length; i++) {
            if (intArr0[i] == -100) {
                System.out.println("Нашли: " + intArr0[i]);
                break;
            }
            System.out.println("Neat iteration");
        }

        for (int i = 0; i < intArr0.length; i++) {
            if (intArr0[i] != -100) {
                continue;
            }
            System.out.println("Нашли: " + intArr0[i]);
            break;
        }

        // целые числа
        byte varByte = 0; // 2 бита -128 ... 127
        short varShort = 0; // 8 бита -32768 ... 32767
        // must have int самый используемый
        int varInt = 0; // 32 бита от -2 в 31 степени
        long varLong = 0L; // 64 бита -2 в 63 степени

        // числа с плавающей точкой
        float varFloat = 0.0f; //32 бита
        // must have double самый используемый
        double varDouble = 0.0d; //64 бита
        // теряется точность при числах с плавающими точками
        // поэтому для арифметики редко применяется

        // логический
        boolean varBool1 = true;
        boolean varBool2 = false; // дефолтное значение

        // символьный только 1 символ!
        char varChar = '0'; //у всех примитивных типов данных дефолтное значение 0

        // оператор = присваивает значение

        String varStr = "Hello";
        String varDefault = null; //по умолчанию

        // ОПЕРАТОРЫ
        // 1.Присвоения
        int varInt1 = 1;
        varInt1 += 10; //редко используется

        // 2. Математические +, -, * ,/, %, ++, --
        varInt1 = 4 + 7;
        varInt1 = 4 * 7;
        varInt1 = 7 / 4; // ыелочисленное деление, результат будет 1
        varInt1 = 7 % 4; // остаток от целочисл. деления, результат будет 3
        varInt1 = ++; //вычесть единицу перед тем как вернуть результат или наоборо
        varInt1 = varInt1++; //вычесть единицу и вернуть результат

        // 3. Сравнения >, <, >=, <=, !=, ==
        if (1 == 1) // сравнение идентичности, как и !=

            // 4. Логические операторы работают с типом boolean && (и), || (или), ! (не)
            if ((age >= 30) && (sex.equals("female")))
                if (!(age >= 30) && (sex.equals("female")))) // ! меняет true на false
        if ((age >= 30) || (sex.equals("female")))

            if (varStr != null && varStr.length() == 10) {
                System.out.println(varStr);
            } else if (varStr != null && varStr.length() == 9) {
                System.out.println("Извините, строка из 9 символов");
            } else {
                System.out.println("Извините, строка не из 9 или 10 символов");
            }


        System.out.println("Hello world!");
    }
}