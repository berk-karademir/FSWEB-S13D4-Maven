package org.example;

public enum Weapon {
    SWORD(20 , 1.0), BOW(5, 2.5), THROWINGAXE(7, 2.0);
    private int damage;
    private double attackSpeed;

    // Weapon Constructor
    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }
    // getter methods
    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

}
