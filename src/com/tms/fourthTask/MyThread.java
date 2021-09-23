package com.tms.fourthTask;

import java.util.LinkedList;
import java.util.Random;

public class MyThread {
    private LinkedList<Integer> num = new LinkedList<>();
    public synchronized void produce() throws InterruptedException {
        if (num.size() >= 10) wait();
        num.add(new Random().nextInt());
        System.out.println("Добавлено число, количество чисел: " + num.size());
        notify();
    }
    public synchronized void consume() throws InterruptedException{
        if (num.isEmpty()) wait();
        num.removeFirst();
        System.out.println("Число удалено, количество чисел: " + num.size());
        Thread.sleep(new Random().nextInt(10));
        notify();
    }
}
