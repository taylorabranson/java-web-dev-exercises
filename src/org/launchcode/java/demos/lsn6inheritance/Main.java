package org.launchcode.java.demos.lsn6inheritance;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HouseCat winnifred = new HouseCat("Winnifred", 9);
        System.out.println(winnifred.purr());
        System.out.println(winnifred.noise());
        winnifred.eat();
        System.out.println(winnifred.isTired());
        System.out.println(winnifred.isHungry());

        HouseCat leia = new HouseCat("Leia");

        System.out.println(leia.purr());
        System.out.println(leia.getWeight());
        leia.sleep();
        System.out.println(leia.noise());

    }
}
