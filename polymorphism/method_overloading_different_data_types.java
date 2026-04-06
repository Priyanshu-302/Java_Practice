package polymorphism;

class B {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class method_overloading_different_data_types {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.add(10, 20));
        System.out.println(b.add(10.5, 20.5));
    }
}
