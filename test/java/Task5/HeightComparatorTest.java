package Task5;

import Task2.HomeTextiles;
import Task3.Manager.HeightComparator;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class HeightComparatorTest {

    @Test
    void testHeightComparator() {
        ArrayList<HomeTextiles> searchHomeTextiles = new ArrayList<>();

        HomeTextiles cartoons = new HomeTextiles(80, 170, "Cartoons from JYSK");
        HomeTextiles bedSheets = new HomeTextiles(120, 170, "Bed Sheets from Castorama");

        searchHomeTextiles.add(cartoons);
        searchHomeTextiles.add(bedSheets);

        HeightComparator myHeightComparator = new HeightComparator();
    }
}