package classes_and_objects;

class Student7 {
    int id;
    static String clg = "ABC";

    Student7(int id) {
        this.id = id;
    }

    void display() {
        System.out.println(id + " " + clg);
    }
}

public class static_variable_example {
    public static void main(String[] args) {
        Student7 s1 = new Student7(1);
        Student7 s2 = new Student7(2);

        s1.clg = "XYZ";

        s1.display();
        s2.display();
    }
}
