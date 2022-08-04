package ru.otus.homeworks.HW6;

import com.sun.jdi.IntegerValue;

import java.util.*;

public class HomeWork6 {
    public static void main(String[] args) {
        long timeStarted = System.nanoTime();
        List<Integer> list1 = Arrays.asList(5,4,5,7,8,1,3,2,9,12,54,3,44,53,9,33,32,35,67,122,13,10);
        ArrayList <Integer> list = new ArrayList<Integer>();
        list.addAll(list1);
        System.out.println("До сортировки " + list);
       /* for (int i=0; i<1000000; i++) {
            list1.add(i);
        }*/
        Collections.sort(list);
        long timeFinish = System.nanoTime();
        long time = timeFinish - timeStarted;
        System.out.println("Размер ArrayList list " + list.size());
        System.out.println("Время сортировки методом Collections.sort " + time);
        System.out.println("После сортировки " + list);

        /*public static List<Integer> intsInRange(int size, int lowerBound, int upperBound) {
            Random random = new Random();
            List<Integer> result = new ArrayList<>();
            int timeStarted = (int) System.currentTimeMillis();
            for (int i = 0; i < size; i++) {
                result.add(random.nextInt(upperBound - lowerBound) + lowerBound);
            }
            Collections.sort(result);
            int time = (int) (System.currentTimeMillis() - timeStarted);
             return result;
            //return time;*/

    }
}