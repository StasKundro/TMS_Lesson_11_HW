package com.tms.firstTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MyThread extends Thread {

    MyThread(String name) {
        super(name);
        start();

    }

    @Override
    public void run() {
        System.out.println(MyThread.this);
    }

    private ArrayList<Integer> generator() {
        ArrayList<Integer> list1 = new ArrayList<>(10);
        ArrayList<Integer> list2 = new ArrayList<>(10);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list1.add(random.nextInt(1000) + 1);
            list2.add(i);
        }
        return list1;
    }

    private String getMax(ArrayList<Integer> list) {
        return Collections.max(list).toString();
    }

    @Override
    public String toString() {
        return "Максимальное в потоке \"" + super.getName() + "\"  - " + getMax(generator());
    }

}
