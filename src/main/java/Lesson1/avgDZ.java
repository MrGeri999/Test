package Lesson1;

public class avgDZ {
    public static void main(String[] args) {
        avgDZ assets = new avgDZ();
         assets.avg();
//        System.out.println("true");
    }
    public void avg() {
        int a = 1;
        int b = 2;
        double c = (double) (a + b) /2;
        int v = (a + b) /2;
        if (c / v == 1){
            System.out.println("true");

        }
        else {
            System.out.println("false");

        }

    }
}
