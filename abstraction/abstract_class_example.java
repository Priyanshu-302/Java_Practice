package abstraction;

abstract class A {
    abstract void show();

    void display() {
        System.out.println("Hello World");
    }
}

class B extends A {
    void show() {
        System.out.println("Hello");
    }
}

public class abstract_class_example {
    public static void main(String[] args) {
        A a = new B();
        a.display();

        B b = new B();
        b.show();

        // A obj = new A(); cannot instantiate an abstract class
    }
}
