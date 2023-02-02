package com.techreturners.cats;

interface Cat {

    void eat();
    void goToSleep();
    void wakeUp();
    void run();
    default String isAsleep(){
        return "Cat should be awake by default";
    };

}
