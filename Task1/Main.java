package Task1;

public class Main {
    public static void main(String[] args) {
        Task1.Park first = new Task1.Park("Franka", 24.58f, 2.00f);
        Task1.Park second = new Task1.Park();
        Task1.Park third = new Task1.Park("symonenka", 120.4f, 4.0f);
        Park [] parks = {first, second, third};
        for (int i = 0; i < parks.length; i++){
            System.out.println(parks[i]);
        }

        System.out.println(first);

        System.out.println("\n");

        System.out.println(second);

        System.out.println("\n");

        System.out.println(third);

        System.out.println("\n");

        System.out.println(Task1.Park.playgroundCounter());
    }
}