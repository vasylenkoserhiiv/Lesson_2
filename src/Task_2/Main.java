package Task_2;

public class Main {
    public static void main(String[] args) {
        Machine car1 = new Machine();
        Machine car2 = new Machine(2000);
        Machine car3 = new Machine(3000, 300.0);
        Machine car4 = new Machine(4000, 400, 4000);
        Machine car5 = new Machine(5000, 500, 5000, "blue");

        System.out.println("Car 2 Year: " + car2.getYear());
        System.out.println("Car 3 Speed: " + car3.getSpeed());
        System.out.println("Car 4 Weight: " + car4.getWeight());
        System.out.println("Car 5 Color: " + car5.getColor());

    }

}
