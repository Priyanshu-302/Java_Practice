package nested_class;

// Resolve variable conflict using Outer.this.
class A {
    int x = 10;

    class B {
        int x = 20;

        void show() {
            System.out.println(x);
            System.out.println(this.x);
        }
    }
}

public class inner_class_with_outer_this {
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        b.show();
    }
}
