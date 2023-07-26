package Task_2;
/*
Створити клас Машина з полями рік(int), швидкість(double), вага(int) колір(String).
Створити конструктор за замовчуванням, конструктор з 1 параметром, 2-а, 3-я, 4-а. Перевантажити конструктори.
Створити клас Main, де створити екземляри класу Машина з різними параметрами.
 */
public class Machine {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Machine (){
        this.year = 0;
        this.speed = 0.0;
        this.weight = 0;
        this.color = "Unknown";
    }
    public Machine(int year){
        this.year = year;
        this.speed = 0.0;
        this.weight = 0;
        this.color = "Unknown";
    }
    public Machine(int year, double speed){
        this.year = year;
        this.speed = speed;
        this.weight = 0;
        this.color = "Unknown";
    }
    public Machine(int year, double speed, int weight){
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = "Unknown";
    }
    public Machine(int year, double speed, int weight, String color){
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColour(String colour) {
        this.color = colour;
    }

    public int getYear() {
        return year;
    }

    public double getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }
}
