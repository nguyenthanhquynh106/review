package static_final;

class Student {
    int id;
    String name;
    static String city = "NTQ";

    static void change() {
        city = "NTQ Solution";
    }

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " - " + name + " - " + city);
    }
}

public class StaticDemo {

    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(111, "Quỳnh");
        Student s2 = new Student(222, "Thanh");
        Student s3 = new Student(333, "Anh");

        s1.display();
        s2.display();
        s3.display();
    }
}
