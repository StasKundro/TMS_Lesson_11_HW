package com.tms.thirdTask;

/**
 * Создать класс с синхронизированным методом, который выводит на экран имя текущего потока,
 * текущее время и вызывает sleep на 5 секунд.
 * Запустить 10 потоков, которые вызывают этот метод от созданного объекта.
 */

public class Test {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("1");
        MyThread t2 = new MyThread("2");
        MyThread t3 = new MyThread("3");
        MyThread t4 = new MyThread("4");
        MyThread t5 = new MyThread("5");
        MyThread t6 = new MyThread("6");
        MyThread t7 = new MyThread("7");
        MyThread t8 = new MyThread("8");
        MyThread t9 = new MyThread("9");
        MyThread t10 = new MyThread("10");
    }
}
