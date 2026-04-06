package polymorphism;

class C {
    void show() {
        System.out.println("No arguments passed");
    }

    void show(String name) {
        System.out.println(name);
    }
}

public class change_no_of_arguments {
    public static void main(String[] args) {
        C c = new C();
        c.show();
        c.show("John");
    }
}
