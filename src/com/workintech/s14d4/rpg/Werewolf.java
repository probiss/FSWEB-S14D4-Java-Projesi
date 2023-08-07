package com.workintech.s14d4.rpg;

public class Werewolf extends Monster{

    public Werewolf(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    public double attack() {
        return getDamage() + bleed() + poison();
    }

    @Override
    public double bleed() {
        return getDamage() * 0.25 ;
    }

    @Override
    public double poison() {
        return 0;
    }
}
