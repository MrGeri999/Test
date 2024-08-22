package lesson2;

public class MainPerson {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person(", Маргарян Мгер,", 26);
        Person p3 = new Person(", Дерево,", 17);

//        System.out.println(p1.);
//        System.out.println(p2);
        p1.talk();
        p2.talk();
        p3.talk();

        Person.count();
    }
}
