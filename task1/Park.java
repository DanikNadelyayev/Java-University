package com.task1;

public class Park {
    public String adr;
    public float lengthOfRoads;
    public float ticketPrice;
    private float space;
    private int sportsGrounds;
    private int cafe;

    public static int playground = 4;

    public static int playgroundCounter() {

        return playground;
    }

    public Park () {
        this("Mickevycha", 1.02f,256.0f);
    }

    public Park(String adr, float lengthOfRoads, float ticketPrice) {
        this.adr = adr;
        this.lengthOfRoads = lengthOfRoads;
        this.ticketPrice = ticketPrice;

    }

    public String toString() {
        return String.format("st. %s \nBike roads: %.2f m \nPrice of Ticket: %.0f uah", adr, lengthOfRoads, ticketPrice);
    }

    public void say() {

    }
}
