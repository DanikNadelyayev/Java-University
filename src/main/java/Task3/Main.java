package Task3;

import Task2.HomeTextiles;
import Task3.Manager.WidthComparator;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<HomeTextiles> searchHomeTextiles = new ArrayList<>();

        HomeTextiles mattress = new HomeTextiles(180, 140, "Mattresses");
        HomeTextiles castorCurtain = new HomeTextiles(70, 150, "Castorama curtain");
        HomeTextiles jYSKCurtain = new HomeTextiles(90, 200, "JYSK curtain");
        HomeTextiles iKEACurtain = new HomeTextiles(65, 180, "IKEA curtain");
        HomeTextiles bedSheets = new HomeTextiles(200, 160, "Bed Sheets");

        searchHomeTextiles.add(jYSKCurtain);
        searchHomeTextiles.add(castorCurtain);
        searchHomeTextiles.add(iKEACurtain);

        for (HomeTextiles h : searchHomeTextiles) {
            System.out.println("\n" + h);
        }

        WidthComparator myWidthComparator = new WidthComparator();
        searchHomeTextiles.sort(myWidthComparator);

        System.out.println("\n" + "Sorted: ");
        for (HomeTextiles h : searchHomeTextiles) {
            System.out.println("\n" + h);
        }


        HomeTextiles searchElement = castorCurtain;

        for (int i = 0; i < searchHomeTextiles.size(); i++) {
            if (searchElement == searchHomeTextiles.get(i)) {
                System.out.println("\n" + "element is found:" + "\n" + searchElement);

                break;
            }

        }
    }
}
