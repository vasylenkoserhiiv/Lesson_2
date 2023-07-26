package Task_3;

public class Car {
    public static void main(String[] args) {
        Machine car1 = new Machine();
        Machine car2 = new Machine(2022);
        Machine car3 = new Machine(2023, 160);
        Machine car4 = new Machine(2021, 180, 2);
        Machine car5 = new Machine(2019, 210, 3, "yellow");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}
