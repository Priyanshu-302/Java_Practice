package classes_and_objects;

class Student5 {
    int id;
    String name;

    Student5(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

}

public class this_keyword {
    public static void main(String[] args) {
        Student5 s = new Student5(1, "Priyanshu");
        s.display();
    }
}
