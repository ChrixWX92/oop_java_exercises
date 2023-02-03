package com.techreturners.cats;

import java.util.concurrent.ThreadLocalRandom;

public class DomesticCat extends Feline {

    public DomesticCat() {
        this.eatMessage = "Purrrrrrr";
        this.averageHeight = 23;
    }

    @Override
    public String eat() {
        if (this.hashCode() % 3 == 0 && ThreadLocalRandom.current().nextBoolean())
            return "*unimpressed groan*";
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
    public int getAverageHeight() {
        return this.averageHeight;
    }

    @Override
    public String getSetting() {
        return "domestic";
    }


}
