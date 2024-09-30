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
    }

    public int take(int amount){
        if(amount > 0 && this.money > amount){
            this.money -= amount;
            return amount;
        }
        return 0;
    }
}
