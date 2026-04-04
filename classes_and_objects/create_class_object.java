package classes_and_objects;

class Student {
    int id;
    String name;
}

public class create_class_object {
    public static void main(String[] args) {
        Student s = new Student();
        s.id = 1;
        s.name = "Priyanshu";

        System.out.println(s.id + " " + s.name);
    }
}
