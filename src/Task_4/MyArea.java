package Task_4;
/*
Створити клас MyArea, в ньому оголосити константу PI = 3.14 та статичний метод areaOfCircle, який повинен приймати
радіус та використовуючи PI порахувати площу кола. Створити клас Main, де запустити цей метод.
 */
public class MyArea {
    public static final float PI = 3.14f;

    public static float areaOfCircle(float radius){
        return PI * radius * radius;
    }

}
