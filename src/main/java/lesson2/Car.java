package lesson2;

import com.sun.org.apache.xml.internal.utils.XMLStringFactory;

public class Car { // 2 Лекция, 23 слайд - 24. Создать класс Person, который содержит...

    private String model;
    private String color = "yellow";
    private int speed;

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public Car(String model, String color, int speed){
            this.model = model;
            this.color = color;
            this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 500){
            System.out.println("Скорость выше возможной");
        }
        this.speed = speed;
    }



}
