package com.techreturners.cats;

public class LionCat extends Feline {

    public LionCat() {
        this.eatMessage = "Roar!!!!";
        this.averageHeight = 1100;
    }

    @Override
    public String eat() {
        return this.eatMessage;
    }

    @Override
    public void goToSleep() {
        this.asleep = true;
    }

    @Override
    public void wakeUp() {
        this.asleep = false;
    }


    @Override
    public boolean isAsleep() {
        return false;
    }

    @Override
    public int getAverageHeight() {
        return this.averageHeight;
    }

}
