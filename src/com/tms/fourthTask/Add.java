package com.tms.fourthTask;

public class Add extends Thread{

    private MyThread num;

    public Add(MyThread storage) {
        this.num = storage;
    }

    @Override
    public void run() {
        while (true){
            try {
                num.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
