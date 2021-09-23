package com.tms.secondTask;

/**
 *  Создать класс поток, который создает средствами Java файл и записать в него рандомно
 *  сгенерированный массив из 10 целых чисел. Запустить 5 потоков.
 */

public class Test {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        MyThread t4 = new MyThread();
        MyThread t5 = new MyThread();
    }
}
