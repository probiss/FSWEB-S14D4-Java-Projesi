package com.workintech.s14d4.rpg;

public class Monster implements Bleedable, Poisonable {

    private String name;
    private int hitPoints;
    private double damage;

    public Monster(String name, int hitPoints, double damage) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public double getDamage() {
        return damage;
    }


    public double attack() {
        return getDamage() + bleed() + poison();
    }

    @Override
    public double bleed() {
        return 0;
    }

    @Override
    public double poison() {
        return 0;
    }
}
