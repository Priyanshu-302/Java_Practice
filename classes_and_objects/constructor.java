package classes_and_objects;

class Student3 {
    int id;
    String name;

    Student3(int i, String n) {
        id = i;
        name = n;
    }
}

public class constructor {
    public static void main(String[] args) {
        Student3 s = new Student3(1, "Priyanshu");
        System.out.println(s.id + " " + s.name);
    }
}
