package com.task3;

import java.util.ArrayList;
import java.util.Collection;


public class Main {
    public static void main(String[] args) {
        ArrayList<HomeTextiles1> searchHomeTextiles = new ArrayList<>();

        HomeTextiles1 mattress = new HomeTextiles1(180,140,"Mattresses");
        HomeTextiles1 castorCurtain = new HomeTextiles1(70,150,"Castorama curtain");
        HomeTextiles1 jYSKCurtain = new HomeTextiles1(90,200,"JYSK curtain");
        HomeTextiles1 iKEACurtain = new HomeTextiles1(65,180,"IKEA curtain");
        HomeTextiles1 bedSheets = new HomeTextiles1(200,160,"Bed Sheets");

        searchHomeTextiles.add(jYSKCurtain);
        searchHomeTextiles.add(castorCurtain);
        searchHomeTextiles.add(iKEACurtain);

        for (HomeTextiles1 h: searchHomeTextiles) {
            System.out.println("\n" + h);
        }

        WidthComparator myWidthComparator = new WidthComparator();
        searchHomeTextiles.sort(myWidthComparator);

        System.out.println("Sorted: ");
        for (HomeTextiles1 h: searchHomeTextiles) {
            System.out.println("\n" + h);
        }


        HomeTextiles1 searchElement = castorCurtain;

        // Пошук об'єктів
        for(int i = 0; i < searchHomeTextiles.size(); i++) {
            if (searchElement == searchHomeTextiles.get(i)){
                System.out.println("\n" + "element is found:" + "\n" + searchElement );

                break;
            }
        }


    }
}
