package ru.otus.homeworks.HW8;

public class Rethrow {
    public static void main(String args[]) {

        try {
            div(5, 0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
        public static void div (int a, int b) throws RuntimeException {
            try {
                System.out.println(a / b);
            } catch (ArithmeticException e) {
                System.out.println(e);
                throw new IllegalArgumentException(e);
            }
        }
}
