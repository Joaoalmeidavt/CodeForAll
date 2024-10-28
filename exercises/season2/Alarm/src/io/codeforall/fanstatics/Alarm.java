package io.codeforall.fanstatics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Timer;
import java.util.TimerTask;

public class Alarm {

    Timer timer;

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String interval = null;
        String rings = null;

        System.out.println("Number of times to ring?");

        try {
            rings = reader.readLine();
        } catch (IOException e) {
           e.printStackTrace();
        }

        System.out.println("Interval between rings?");

        try {
            interval = reader.readLine();
        } catch (IOException e) {
           e.printStackTrace();
        }

        Alarm alarm = new Alarm();
        alarm.start(interval,rings);

        Alarm alarm1 = new Alarm();
        alarm1.start(interval,rings);

    }

    private void start(String interval, String rings) {

        timer = new Timer();
        timer.scheduleAtFixedRate(new Ring(Integer.parseInt(rings)), Integer.parseInt(interval) * 1000, Integer.parseInt(interval) * 1000);

    }

    private class Ring extends TimerTask{

        private int numRings;

        public Ring(int numRings) {
            this.numRings = numRings;
        }

        @Override
        public void run() {

            System.out.println(Thread.currentThread().getName());

            System.out.println("Alarm is ringing.....");

            numRings--;

            if (numRings == 0){
                System.out.println("Alarm is cancelled");
                stop();
            }

        }
        private void stop(){
         timer.cancel();

        }
    }

}
