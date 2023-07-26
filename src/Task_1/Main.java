package Task_1;

public class Main {
    public static void main(String[] args) {
        Machine car = new Machine();
        Machine car1 = new Machine(2000);
        Machine car2 = new Machine(2001, "black");

        System.out.println(car.getYear() + " " + car.getColour());
        System.out.println(car1.getYear() + " " + car1.getColour());
        System.out.println(car2.getYear() + " " + car2.getColour());
    }
}
