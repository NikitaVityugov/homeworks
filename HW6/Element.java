package ru.otus.homeworks.HW6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Element {

    public static void main(String[] args) {
        long timeStarted = System.nanoTime();
        List<Integer> input = Arrays.asList(5, 4, 5, 7, 8, 1, 3, 2, 9, 12, 54, 3, 44, 53, 9, 33, 32, 35, 67, 122, 13, 10);
        ArrayList<Integer> input1 = new ArrayList<Integer>();
        input1.addAll(input);
        System.out.println("До сортировки " + input1);
        bubbleSort(input1);
        long timeFinish = System.nanoTime();
        long time = timeFinish - timeStarted;
        System.out.println("Размер ArrayList input1 " + input1.size());
        System.out.println("Время сортировки методом Bubble.sort " + time);
        System.out.println("После сортировки " + input1);
    }

    static void bubbleSort(List<Integer> arr) {
        int n = arr.size();
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}