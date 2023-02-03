package com.techreturners.cats;

public class CheetahCat extends Feline {

    public CheetahCat() {
        this.eatMessage = this.eatMessage = "Zzzzzzz";
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
