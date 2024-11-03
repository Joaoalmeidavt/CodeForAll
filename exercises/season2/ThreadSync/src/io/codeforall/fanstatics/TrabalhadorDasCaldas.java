package io.codeforall.fanstatics;

public class TrabalhadorDasCaldas implements Runnable{

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());

        for (int i = 0; i < 10 ; i++) {
            System.out.println(Thread.currentThread().getName() + " TRABALHADOR DAS CALDAS: Aqui a fazer um caralho...");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Estava a dormir, mas acordaram-me!!!");
                e.printStackTrace();
            }
        }

        System.out.println("TRABALHADOR DAS CALDAS: Não faço mais um caralho...");
    }
}
