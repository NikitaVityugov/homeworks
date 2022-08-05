package ru.otus.homeworks.HW5;

import java.util.Arrays;
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

      /*  for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].question);*/
        int i = 0;
        int k = 0;
            while (i < questions.length) {
                System.out.println(questions[i].question);


           /* for (int j = 0; j < questions[i].answersOptions.length ; j++) { //  each
                System.out.println(questions[i].answersOptions[j]);
            }*/

                for (int an : questions[i].answersOptions) {  // почему тип int а не Question
                    System.out.println(an);

                }
                i++;

                System.out.println("Ваш ответ: ");

                int answerUser = scanner.nextInt();
                switch (answerUser) {
                    case 60:
                    case 365:
                    case 24:
                        correctCount = correctCount + 1;
                        System.out.println("Верно ");
                        break;

                    default:
                        wrongCount = wrongCount + 1;
                        System.out.println("Неверно ");
                        break;

                }
               /* if (answerUser.equals(questions[i].answer)) {   // switch
                    System.out.println("Верно ");
                    correctCount = correctCount + 1;
                } else {

                    System.out.println("Неверно ");
                    wrongCount = wrongCount + 1;
                }*/
            }
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}

