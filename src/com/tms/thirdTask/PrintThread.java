package com.tms.thirdTask;

import java.util.Date;

public class PrintThread {
    class Print {
        static synchronized void print(Thread thread) throws Exception {
            Date date = new Date();
            System.out.println("[" + thread.getName() + "] - " + date);
            Thread.sleep(5000);
        }
    }
}

