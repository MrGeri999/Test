package Lesson4; // 4 урок, 28 слайд

public class Main {
    public static void main(String[] args) {
        Kvadrat kvadrat = new Kvadrat(12,6);
        kvadrat.calcusquare();
        kvadrat.draww();
        System.out.println("Площадь квадрата " + kvadrat.calcusquare());

        Romb romb = new Romb(12,6);
        romb.calcusquare();
        romb.draww();
        System.out.println("Площадь ромба " + romb.calcusquare());

        Treyg treyg = new Treyg(12,6);
        treyg.calcusquare();
        treyg.draww();
        System.out.println("Площадь треугольника " + treyg.calcusquare());
    }
}
