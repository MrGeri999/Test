package lesson2;

public class Person {
    public String getFullName() {
        return fullName;
    }

    public Person(){
        this.fullName = null;
        this.age = 0;
        this.id = count++;
    }

    public Person (String fullName, int age){
        this.fullName = fullName;
        this.age = age;
        this.id = count++;
    }

    public void talk() {
        if (fullName != null || age > 0) {
            if (id == 2)
            {
                System.out.println("Привет я" + fullName + " избранный");
            }
        else {
                System.out.println("Привет я" + fullName + " и мне" + age + "лет.");
            }
        }
    }


    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String fullName;
    private int age;
    private int id;
    private static int count = 0;

    public int getId() {
        return id;
    }

    public static void count(){
        System.out.println(count);
    }

    public void setId(int id) {
        this.id = id;
    }



}

//Не понимаю что за p1.talk и p2 в main, почему не sout и что за странная строчка 18.