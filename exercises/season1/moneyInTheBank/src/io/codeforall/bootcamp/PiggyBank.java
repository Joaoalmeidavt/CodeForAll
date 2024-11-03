package io.codeforall.bootcamp;

public class PiggyBank {
    private int money;
    private Account account;

    public PiggyBank(Account account){
        this.account = account;
    }

    public int getMoney() {
        return money;
    }

    public void deposit(int amount){
        if(amount > 0){
            account.money -= amount;
            money += amount;
        }
        System.out.println("Deposited " + amount + "$ in the bank");
    }

    public int take(int amount){
        if(amount > 0 && this.money > amount){
            this.money -= amount;
            System.out.println("Took " + amount + "$ from the bank");
            return amount;
        }
        System.out.println("Not able to take " + amount + "$ from the bank, not enough money.");
        return 0;
    }
}

