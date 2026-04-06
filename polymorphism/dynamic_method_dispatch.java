package polymorphism;

class C {
    void show() {
        System.out.println("No arguments passed");
    }
}

class D extends C {
    void show() {
        System.out.println("One argument passed");
    }
}

public class dynamic_method_dispatch {
    public static void main(String[] args) {
        C obj;

        obj = new C();
        obj.show();

        obj = new D();
        obj.show();
    }
}
