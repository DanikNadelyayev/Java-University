package task5_6;

import task2.HomeTextiles;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ComparatorTest {

    @Test
    void testComparatorMethod() {
        /*    @BeforeEach
    void List () throws Exception {
        ArrayList<HomeTextiles> searchHomeTextiles = new ArrayList<>();

        HomeTextiles cartoons = new HomeTextiles(80, 170, "Cartoons from JYSK");
        HomeTextiles bedSheets = new HomeTextiles(120, 170, "Bed Sheets from Castorama");

        searchHomeTextiles.add(cartoons);
        searchHomeTextiles.add(bedSheets);*/


            ArrayList<HomeTextiles> searchHomeTextiles = new ArrayList<>();

            HomeTextiles cartoons = new HomeTextiles(80, 170, "Cartoons from JYSK");
            HomeTextiles bedSheets = new HomeTextiles(120, 190, "Bed Sheets from Castorama");
            HomeTextiles mattress = new HomeTextiles(180, 140, "Mattresses");

            searchHomeTextiles.add(cartoons);
            searchHomeTextiles.add(bedSheets);

            assertEquals(80, cartoons.getHeight() );
            assertEquals(170, cartoons.getWidth() );
            assertEquals("Cartoons from JYSK", cartoons.getType() );

            assertEquals(120, bedSheets.getHeight() );
            assertEquals(190, bedSheets.getWidth() );
            assertEquals("Bed Sheets from Castorama", bedSheets.getType() );

            assertEquals(180, mattress.getHeight() );
            assertEquals(140, mattress.getWidth() );
            assertEquals("Mattresses", mattress.getType() );

        }
    }
