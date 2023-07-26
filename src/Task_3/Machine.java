package Task_3;
/*
Створити клас Машина з полями рік(int), швидкість(double), вага(int) колір(String).
Створити конструктор за замовчуванням, конструктор з 1 параметром, 2-а, 3-а, 4-а.
Перевантажити конструктори викликаючи конструктор із конструктора. Створити клас Main, де створити екземляри класу
Машина з різними параметрами.
 */
public class Machine {
    private int year;
    private double speed;
    private int weight;
    private String color;


    public Machine(int year, double speed, int weight, String color){
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }
    public Machine(){
        this(2020, 200.0, 2, "blue");
    }
    public Machine(int year){
        this(year, 150, 3, "red");
    }
    public Machine(int year, double speed){
        this(year, speed, 4, "black");
    }
    public Machine(int year, double speed, int weight){
        this(year, speed, weight, "brown");
    }
}
