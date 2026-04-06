package polymorphism;

class A {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class method_overloading {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.add(10, 20));
        System.out.println(a.add(10, 20, 30));
    }
}
