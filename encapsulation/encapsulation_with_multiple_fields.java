package encapsulation;

class D {
    private int id;
    private String name;

    public void setter(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void getter() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class encapsulation_with_multiple_fields {
    public static void main(String[] args) {
        D obj = new D();
        obj.setter(101, "John Doe");
        obj.getter();
    }
}
