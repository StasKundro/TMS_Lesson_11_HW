package com.tms.fourthTask;

public class Dell extends Thread{

    private MyThread num;

    public Dell(MyThread storage) {
        this.num = storage;
    }

    @Override
    public void run() {
        while (true){
            try {
                num.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
