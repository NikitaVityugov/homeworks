package ru.otus.homeworks.HW8;

public class Rethrow {
    public static void main(String args[]) {  // №2
        try {
            div(5, 0);
        } catch (ArithmeticException e) {
            System.out.println("В процессе выполнения снова произошла арифметическая ошибка:");
        }
    }
        public static void div (int a, int b) throws ArithmeticException{
            try {
                System.out.println(a / b);
            } catch (ArithmeticException e) {
                System.out.println("В процессе выполнения произошла арифметическая ошибка: (деление на ноль)");
                throw e;
            }
        }
}
