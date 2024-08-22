package lesson2;

public class MainClass {
    public static void main(String[] args) {
        Car x5 = new Car("x5", "white",150 );
        Car x6 = new Car("x6",250);

        x5.setSpeed(650);

        System.out.println(x5.getColor());
        System.out.println(x6.getColor());
    }

}
