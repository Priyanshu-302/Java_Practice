package classes_and_objects;

class Student2 {
    int id;
}

public class multiple_objects {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        Student2 s2 = new Student2();

        s1.id = 1;
        s2.id = 2;

        System.out.println(s1.id + " " + s2.id);
    }
}
