package com.task3;

import java.util.Comparator;

public class HeightComparator implements Comparator<HomeTextiles1> {

    @Override
    public int compare(HomeTextiles1 h1, HomeTextiles1 h2) {
        if (h1.height == h2.height) {
            return 0;
        }
        if (h1.height > h2.height) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
