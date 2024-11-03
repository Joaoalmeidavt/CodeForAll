package io.codeforall.fanstatics;

public class ThreadLauncher {

    public static void main(String[] args) {

        MyTask myTask = new MyTask();
        myTask.run();

        for (int i = 0; i < 10 ; i++) {

            Thread thread = new Thread(new MyTask());
            thread.setName("T" + i);
            thread.start();

        }

        Thread thread = new Thread(myTask);
        thread.start();
    }
}
