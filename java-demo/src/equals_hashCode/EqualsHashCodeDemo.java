package equals_hashCode;

import java.util.HashSet;
import java.util.Set;

class Student {
    private String id;
    private String name;
    private String email;
    private int age;

    public Student(String id) {
        this.id = id;
    }

    public Student(String id, String name, String email, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String toString() {
        String studentInfo = "Student " + id;
        studentInfo += ": " + name;
        studentInfo += " - " + email;
        studentInfo += " - " + age;
        return studentInfo;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student another = (Student) obj;
            if (this.id.equals(another.id)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return 31 + id.hashCode();
    }
}

public class EqualsHashCodeDemo {
    public static void main(String[] args) {
        Student student1 = new Student("123", "Cong", "cong@gmail.com", 22);
        Student student2 = new Student("123", "Cong", "cong@gmail.com", 22);
        Student student3 = new Student("456", "Dung", "dung@gmail.com", 18);

        Set<Student> setStudents = new HashSet<Student>();
        setStudents.add(student1);
        setStudents.add(student2);
        setStudents.add(student3);

        for (Student student : setStudents) {
            System.out.println(student);
        }

        Student searchStudent = new Student("456");
        boolean found = setStudents.contains(searchStudent);
        System.out.println("Search student: " + found);
    }
}
