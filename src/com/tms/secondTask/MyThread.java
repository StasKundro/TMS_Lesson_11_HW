package com.tms.secondTask;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Random;

public class MyThread implements Runnable {

    Thread thread;

    public MyThread() {
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        writeToFile(random());
    }

    private void writeToFile(ArrayList<Integer> list) {
        try {
            String path = "C:\\TMS\\file.txt";
            File file = new File(path);
            file.createNewFile();
            for (Integer i : list) {
                if (list.listIterator().hasNext()) {
                    Files.write(Paths.get(path), (i + "\n").getBytes(), StandardOpenOption.APPEND);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private ArrayList<Integer> random() {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(r.nextInt(100) + 1);
        }
        return list;
    }
}

