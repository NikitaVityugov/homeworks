package ru.otus.homeworks.HW5;

import java.util.Scanner;

class Question {
    String question;
    int answer;
    int[] answersOptions;
    Question(String question, int answer, int[] answersOptions) {
        this.question=question;
        this.answer=answer;
        this.answersOptions= answersOptions;
    }
    public static void main(String[] args) {

        Question question1=new Question("Сколько секунд в минуте?", 60, new int[] {50, 55, 60, 65, 70});
        Question question2=new Question("Сколько  часов в сутках?", 24, new int[] {24, 25, 26, 27});
        Question question3=new Question("Сколько дней в году?", 365, new int[] {360, 365, 370, 375});

        Question [] questions = {question1, question2, question3};

        int correctCount = 0, wrongCount = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].question);


            for (int j = 0; j < questions.length ; j++) {
                System.out.println(questions[i].answersOptions[j]);
            }

              /*  for (int k = 0; k < newArr[1][i].length; k++) {
                    System.out.println(newArr[1][i][k]); // !!!почему выводится строка, а не элемент??
                }
*/
                System.out.println("Ваш ответ: ");

                Integer answerUser = scanner.nextInt();
                if (answerUser.equals(questions[i].answer)) {   // как проверить всю строку?
                    System.out.println("Верно ");
                    correctCount = correctCount + 1;
                } else {

                    System.out.println("Неверно ");
                    wrongCount = wrongCount + 1;
                }

        }

        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}
