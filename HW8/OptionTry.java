package ru.otus.homeworks.HW8;

import java.io.*;

public class OptionTry {
    public static void main(String[] args) {
            try(Reader reader = new FileReader(new File("dgfgtb"))) {
                System.out.println(2);
            }
            catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }
}
