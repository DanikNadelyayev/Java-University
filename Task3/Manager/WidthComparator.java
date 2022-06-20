package Task3.Manager;

import Task2.HomeTextiles;

import java.util.Comparator;

public class WidthComparator implements Comparator <HomeTextiles> {

    @Override
    public int compare(HomeTextiles h1, HomeTextiles h2) {
        if (h1.width == h2.width) {
            return 0;
        }
        if (h1.width > h2.width) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
