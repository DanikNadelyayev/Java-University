package task1;

public class Main {
    public static void main(String[] args) {
        task1.Park first = new task1.Park("Franka", 24.50f, 2.00f);
        task1.Park second = new task1.Park();
        task1.Park third = new task1.Park("symonenka", 120.4f, 4.0f);
        Park[] parks = {first, second, third};
        for (int i = 0; i < parks.length; i++) {
            System.out.println(parks[i]);
        }

        System.out.println(first);

        System.out.println("\n");

        System.out.println(second);

        System.out.println("\n");

        System.out.println(third);

        System.out.println("\n");

        System.out.println(task1.Park.playgroundCounter());
    }
}