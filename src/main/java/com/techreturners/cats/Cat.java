package com.techreturners.cats;

interface Cat {

    String eat();
    void goToSleep();
    void wakeUp();
    default void run(){};
    boolean isAsleep();
    int getAverageHeight();
    default String getSetting() {
        return "wild";
    }

}
