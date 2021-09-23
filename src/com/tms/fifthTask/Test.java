package com.tms.fifthTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Написать программу, бесконечно считывающую пользовательские числа из консоли.
 * Эти числа представляют собой количество секунд.
 * При каждом вводе числа, должна создаваться задача, которая засыпает на введённое число секунд и затем выводит "Я спал N секунд".
 * Однако нужно сделать так, чтобы все задачи выполнялись в отдельном потоке.
 * При вводе -1 программа должна завершать свою работу.
 */

public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Введите колличество секунд");
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int a = 0;
            try {
                a = Integer.parseInt(buff.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (a != -1) {
                MyThread thread = new MyThread("A");
                thread.sleep(a * 1000);
                System.out.println("Я спал " + a + " секунд");
            } else {
                break;
            }
        }
    }
}
