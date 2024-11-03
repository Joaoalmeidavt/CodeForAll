package io.codeforall.fanstatics;

import javax.swing.*;

public class SoldierEnemy extends Enemy {

    public SoldierEnemy(int health) {
        super.health = health;
        super.isDead = false;
    }

    @Override
    public void hit(int damage) {
        super.hit(damage);
        if (this.health <= 0) {
            this.isDead = true;
            System.out.println("Soldier Enemy died.");
            System.out.println(" ");
        }
    }

    @Override
    public void setDestroyed(){
        if(!this.isDead) {
            this.isDead = true;
            System.out.println("Soldier dead.");
        }
    }

    @Override
    public String getMessage(){
        return "U found an enemy.";
    }
}
