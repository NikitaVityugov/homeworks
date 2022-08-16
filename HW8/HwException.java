package ru.otus.homeworks.HW8;

public class HwException {
    public static void main(String args[]) {  // №1 Вывод ошибки

        try {
            System.out.println("????");
            int b = 59 / 0;
        } catch (ArithmeticException e) {
            System.out.println("В процессе выполнения произошла ошибка: (деление на ноль)");
        }

        System.out.println("Идем дальше ");
    }
}
