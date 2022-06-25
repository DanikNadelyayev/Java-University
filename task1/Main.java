package com.task1;

public class Main {
    public static void main(String[] args) {
        Park first = new Park("Franka", 24.58f, 2.00f);
        Park second = new Park();
        Park third = new Park("symonenka", 120.4f, 4.0f);
        System.out.println(first);

        System.out.println("\n");

        System.out.println(second);

        System.out.println("\n");

        System.out.println(third);

        System.out.println("\n");

        System.out.println(Park.playgroundCounter());
    }
}
