package io.codeforall.fanstatics;

import java.util.Iterator;

public class Playground {
    public static void main(String[] args) {

        Range r = new Range(-5, 5);

        System.out.println("--- USING ITERATOR ---");
        Iterator<Integer> it = r.iterator();

        while (it.hasNext()) {

            int i = it.next(); // 0 ...1 ... 2

            if (i == 1 || i == 2 || i == 3) {
                it.remove();
            }
            //System.out.println(i);
        }


        for (Integer i : r) {
            System.out.println("Iterated: " + i);
        }

        for(boolean b : r.collection){
            System.out.print(b + " ");
        }
    }
}
