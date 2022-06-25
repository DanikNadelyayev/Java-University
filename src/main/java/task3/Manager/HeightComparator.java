package task3.Manager;

import task2.HomeTextiles;

import java.util.Collections;
import java.util.Comparator;

public class HeightComparator implements Comparator<HomeTextiles> {

    @Override
    public int compare(HomeTextiles h1, HomeTextiles h2) {
        if (h1.getHeight() == h2.getHeight()) {
            return 0;
        }
        if (h1.getHeight() > h2.getHeight()) {
            return 1;
        } else {
            return -1;
        }
    }
}


