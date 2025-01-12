package org.example;

public enum Weapon {
    SWORD(15 , 1.25),
    THROWINGAXE(5, 2.5),
    CLEAVER(12, 1.5),
    FIST(3,3.5),
    STAFF(5,0.7);

    private int damage;
    private double attackSpeed;

    // Weapon Constructor
    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }
    // getter methods
    public int getDamage() {
        return this.damage;
    }

    public double getAttackSpeed() {
        return this.attackSpeed;
    }

}
