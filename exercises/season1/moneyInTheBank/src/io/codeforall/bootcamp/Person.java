package io.codeforall.bootcamp;

public class Person {
    private String name;
    public Account account;
    public int wallet;
    public PiggyBank bank;
    public Job job;

    public Person(String name, int initialMoney, String jobTitle, int wage) {
        this.name = name;
        this.wallet = (int) (initialMoney * 0.2);
        this.account = new Account(name, (int) (initialMoney*0.8));
        this.bank = new PiggyBank(this.account);
        this.job = new Job(jobTitle, wage);
    }

    public Person(String name, int initialMoney){
        this.name = name;
        this.wallet = (int) (initialMoney * 0.2);
        this.account = new Account(name, (int) (initialMoney*0.8));
        this.bank = new PiggyBank(this.account);
    }

    public void work(){
        System.out.println("Earned " + this.job.wage + "$ from working");
        this.bank.deposit(this.job.wage);
    }

    public void spend(int amount){
        System.out.println("Attempting to spend " + amount + "$");
        if(amount > 0){
            if(this.wallet > amount) {
                this.wallet -= amount;
                System.out.println("Spent amount possible");
            } else {
                System.out.println("Not enough available money in the wallet to be spent in that purchase, asking the bank.");
                if(this.bank.take(amount) > 0){
                    System.out.println("Spent amount possible");
                } else {
                    System.out.println("Spent not possible, not enough money in the bank.");
                };
            }
        }
    }

    public void lend(int amount, Person friend){
        if(this.wallet > amount){
           friend.wallet += amount;
            System.out.println("Successfully lend " + amount + "$ to " + friend.name);
        } else if(this.bank.getMoney() > amount){
            friend.wallet += amount;
            System.out.println("Successfully lend " + amount + "$ to " + friend.name);
        } else {
            System.out.println("Not enough money to lend " + amount + "$ to " + friend.name);
        }
    }
    public void deposit(int amount){
        this.bank.deposit(amount);
    }

    public int take(int amount){
        return this.bank.take(amount);
    }

    public void displayMoney(){
        System.out.println("I have " + bank.getMoney() + "$ in the bank");
    }

}
