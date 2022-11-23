package task5_6;

import task2.HomeTextiles;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SearchHomeTextileTest {


    
    @Test
    void testSearch() {
        ArrayList<HomeTextiles> searchHomeTextiles = new ArrayList<>();

        HomeTextiles cartoons = new HomeTextiles(80, 170, "Cartoons from JYSK");
        HomeTextiles bedSheets = new HomeTextiles(120, 170, "Bed Sheets from Castorama");
        HomeTextiles mattress = new HomeTextiles(180, 140, "Mattresses");

        searchHomeTextiles.add(cartoons);
        searchHomeTextiles.add(bedSheets);
        searchHomeTextiles.add(mattress);

        HomeTextiles searchElement = cartoons;

        for (int i = 0; i < searchHomeTextiles.size(); i++) {
            if (searchElement == searchHomeTextiles.get(i)) {
                System.out.println("\n" + "element is found:" + "\n" + searchElement);

                break;
            }

        }
        assertEquals(cartoons, searchElement);
    }

}