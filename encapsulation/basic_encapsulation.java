package encapsulation;

class Student1 {
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

public class basic_encapsulation {
    public static void main(String[] args) {
        Student1 student = new Student1();
        student.setId(101);
        System.out.println("Student ID: " + student.getId());
    }
}
