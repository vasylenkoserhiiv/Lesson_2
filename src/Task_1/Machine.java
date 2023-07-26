package Task_1;
/*
Створити клас Машина з полями рік(int), колір(String). Створити конструктор за замовчуванням,
конструктор з одним і 2 параметрами. Створити клас Main в якому створити екземпляри, викликаючи різні конструктори.
 */
public class Machine {
    private int year;
    private String colour;

    public Machine(){
    }
    public Machine(int year){
        this.year = year;
    }
    public Machine(int year, String colour){
        this.year = year;
        this.colour = colour;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
