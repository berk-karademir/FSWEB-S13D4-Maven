package org.example;

import org.w3c.dom.ls.LSOutput;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    // constructor with all 3 vars
    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.healthPercentage = healthPercentage <= 0 ? 0 : (healthPercentage > 100 ? 100 : healthPercentage);
        this.weapon = weapon;
    }

    public int healthRemaining() {
        return this.healthPercentage;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void loseHealth(int damage) {
        this.healthPercentage = healthPercentage - damage;
        if (healthPercentage <= 0) {
            System.out.println(name + " has died...");
            this.healthPercentage = 0;
        }
    }
    public void restoreHealth(int healthPotion) {
        this.healthPercentage = healthPercentage + healthPotion;
        if (healthPercentage > 100) {
            healthPercentage = 100;
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", healthPercentage=" + healthPercentage +
                ", weapon=" + weapon +
                '}';
    }
}
