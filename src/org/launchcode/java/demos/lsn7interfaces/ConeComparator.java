package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {
    @Override
    public int compare(Cone o1, Cone o2) {
        int compared = 0;
        if (o1.getCost() < o2.getCost()) {
            compared = -1;
        } else if (o1.getCost() == o2.getCost()) {
            compared = 0;
        } else if (o1.getCost() > o2.getCost()) {
            compared = 1;
        }
        return compared;
    }
}
