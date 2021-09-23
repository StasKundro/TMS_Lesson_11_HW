package com.tms.thirdTask;

public class MyThread implements Runnable{
    String name;
    Thread thread;

    public MyThread(String name) {
        thread = new Thread(this);
        this.name = name;
        thread.setName(name);
        thread.start();
    }

    @Override
    public void run() {
        try {
            PrintThread.Print.print(thread);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
