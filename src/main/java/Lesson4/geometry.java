package Lesson4; // 4 урок, 28 слайд

public abstract class geometry {
    protected double length;
    protected double height;
    protected double square;

    public geometry(double length, double height){
        this.length = length;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
        if (length <=0){
        System.out.println("ошибка");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        if (height <=0){
            System.out.println("ошибка");
        }
    }

    public double getSquare() {
//        this.square = this.height * this.length;
        return this.height * this.length;
    }

    public abstract double calcusquare();

    public double getSumma(){
        return square;
    }
}

class Kvadrat extends geometry implements Draw {
    public Kvadrat(double length, double height) {
        super(length, height);
    }

    @Override
    public double calcusquare() {
        return square = length * height;
    }

    @Override
    public void draww() {
        System.out.println("Нарисован квадрат сторона которого " + length);
    }
}

class Romb extends geometry implements Draw {
    public Romb(double length1, double height1) {
        super(length1, height1);
}
    @Override
    public double calcusquare() {
        return square = (length * height) / 2;
    }

    @Override
    public void draww() {
        System.out.println("Нарисован ромб сторона и высота которого" + length + height);
    }
}

class Treyg extends geometry implements Draw{
    public Treyg(double length2, double height2) {
        super(length2, height2);
    }
    @Override
    public double calcusquare() {
        return square = 0.5 * length * height;
    }

    @Override
    public void draww() {
        System.out.println("Нарисован труегольник сторона и высота которого" + length + height);
    }

}
interface Draw {
    void draww();
}