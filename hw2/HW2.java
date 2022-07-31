package ru.otus.homeworks.hw2;

import java.util.Scanner;

public class HW2 {

    public static void main(String[] args) {
        // Переменные для хранения количества правильных и неправильных ответов
        int correctCount = 0, wrongCount = 0;

        Object[][][] newArr = new Object[][][]{
                {{"Сколько секунд в минуте?", "Сколько  часов в сутках?", "Сколько дней в году?"}},
                {{50, 55, 60, 65, 70}, {24, 25, 26, 27}, {360, 365, 370, 375}},
                {{60, 24, 365}}
        };

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[0][0][i]);

            for (int j = 1; j < 2; j++) {

                for (int k = 0; k < newArr[1][i].length; k++) {
                    System.out.println(newArr[1][i][k]); // !!!почему выводится строка, а не элемент??
                }

                System.out.println("Ваш ответ: ");

                Integer answer = scanner.nextInt();
                if (answer.equals(newArr[2][0][i])) {   // как проверить всю строку?
                    System.out.println("Верно ");
                    correctCount = correctCount + 1;
                } else {

                    System.out.println("Неверно ");
                    wrongCount = wrongCount + 1;
                }
            }
        }

        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}
