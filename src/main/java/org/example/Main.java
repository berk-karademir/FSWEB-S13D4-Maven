package org.example;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Point first = new Point(6,5);
        Point second = new Point(3,1);
        Point point = new Point(0,0);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        System.out.println("distance()= " + point.distance());

        System.out.println();
        System.out.println("----------***    ARENA    ***----------");
        System.out.println("SCENE 1");
        Player TheButcher = new Player("The Butcher", 100, Weapon.CLEAVER);
        Player DeckardCain = new Player("Deckard Cain", 100,Weapon.STAFF);
        Player Wanderer = new Player("Wanderer", 100, Weapon.SWORD);
        System.out.println("Wanderer attacked The Butcher.");
        TheButcher.loseHealth((int) (Wanderer.getWeapon().getDamage() * Wanderer.getWeapon().getAttackSpeed()*2));
        System.out.println("The Butcher is now : " + TheButcher.healthRemaining());
        System.out.println("The Butcher charging in to Wanderer.");
        Wanderer.loseHealth((int) (TheButcher.getWeapon().getDamage() * Wanderer.getWeapon().getAttackSpeed()));
        System.out.println("Wanderer is now : " + Wanderer.healthRemaining());
        System.out.println("The Butcher used his ult: 'Lamb to the Slaughter'");
        System.out.println("Hurling this cleaver in to Wanderer's face again and again");
        Wanderer.loseHealth((int) (TheButcher.getWeapon().getDamage() * Wanderer.getWeapon().getAttackSpeed()*4) );
        System.out.println("Wanderer is now : " + Wanderer.healthRemaining());
        System.out.println("Deckard Cain is trying to peel Wanderer");
        System.out.println("He attacked the Butcher and dropped a Health Potion(50) for Wanderer");
        TheButcher.loseHealth((int) (DeckardCain.getWeapon().getDamage() * DeckardCain.getWeapon().getAttackSpeed()*5));
        System.out.println("The Butcher is now : " + TheButcher.healthRemaining());
        Wanderer.restoreHealth(50);
        System.out.println("Wanderer is now : " + Wanderer.healthRemaining());
        System.out.println("The Butcher is enraging !");
        System.out.println("Attacks Deckard first");
        DeckardCain.loseHealth((int) (TheButcher.getWeapon().getDamage() * TheButcher.getWeapon().getAttackSpeed()) );
        System.out.println("Deckard Cain is now : " + DeckardCain.healthRemaining());
        DeckardCain.loseHealth((int) (TheButcher.getWeapon().getDamage() * TheButcher.getWeapon().getAttackSpeed()) );
        System.out.println("Deckard Cain is now : " + DeckardCain.healthRemaining());
        DeckardCain.loseHealth((int) (TheButcher.getWeapon().getDamage() * TheButcher.getWeapon().getAttackSpeed()) );
        System.out.println("Deckard Cain is now : " + DeckardCain.healthRemaining());
        DeckardCain.loseHealth((int) (TheButcher.getWeapon().getDamage() * TheButcher.getWeapon().getAttackSpeed()) );
        System.out.println("Deckard Cain is now : " + DeckardCain.healthRemaining());
        DeckardCain.loseHealth((int) (TheButcher.getWeapon().getDamage() * TheButcher.getWeapon().getAttackSpeed()) );
        System.out.println("Last strike to his neck...");
        DeckardCain.loseHealth((int) (TheButcher.getWeapon().getDamage() * Wanderer.getWeapon().getAttackSpeed()) );
        System.out.println("The Butcher charging in again... ");
        Wanderer.loseHealth((int) (TheButcher.getWeapon().getDamage() * TheButcher.getWeapon().getAttackSpeed()) );
        System.out.println("Wanderer is now : " + Wanderer.healthRemaining());
        Wanderer.loseHealth((int) (TheButcher.getWeapon().getDamage() * TheButcher.getWeapon().getAttackSpeed()) );
        System.out.println("Wanderer is now : " + Wanderer.healthRemaining());
        Wanderer.loseHealth((int) (TheButcher.getWeapon().getDamage() * TheButcher.getWeapon().getAttackSpeed()) );
        System.out.println("Wanderer is now : " + Wanderer.healthRemaining());
        Wanderer.loseHealth((int) (TheButcher.getWeapon().getDamage() * TheButcher.getWeapon().getAttackSpeed())*2);
        System.out.println("Feasting time for The Butcher...");

    }
}