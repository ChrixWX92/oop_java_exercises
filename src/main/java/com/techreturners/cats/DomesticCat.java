package com.techreturners.cats;

public class DomesticCat implements Cat {

    boolean asleep;
    String setting = "domestic";

    public DomesticCat() {
    }

    @Override
    public void eat() {

    }

    @Override
    public void goToSleep() {

    }

    @Override
    public void wakeUp() {

    }

    @Override
    public void run() {

    }

    public String getSetting() {
        return setting;
    }
    public boolean isAsleep() {
        return asleep;
    }

}
