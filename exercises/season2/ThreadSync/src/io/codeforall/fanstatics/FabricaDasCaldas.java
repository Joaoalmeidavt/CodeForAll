package io.codeforall.fanstatics;

public class FabricaDasCaldas {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());
        System.out.println("GERENTE: À espera que estes colaboradores acabem...");

        Thread trabalhador = new Thread(new TrabalhadorDasCaldas());
        trabalhador.start();

        Thread trabalhador2 = new Thread(new TrabalhadorDasCaldas());
        trabalhador2.start();

        try {
            trabalhador.join();
            trabalhador2.join();
        } catch (InterruptedException e) {
            System.out.println("Acordaram-me da sesta, mas ainda não acabaram!");
            e.printStackTrace();
        }


        System.out.println("GERENTE: Finalmemte acabaram, vou me por no ...");

    }
}
