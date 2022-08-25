package ru.otus.homeworks.HW8;

public class HwException {
    public static void main(String args[]) {  // №1 Вывод ошибки

        try {
            int b = 59 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
            e.printStackTrace();
        }

        System.out.println("Идем дальше ");
    }
}
