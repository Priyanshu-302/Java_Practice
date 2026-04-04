package classes_and_objects;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int sub(int a, int b) {
        return a - b;
    }

    int mul(int a, int b) {
        return a * b;
    }

    int div(int a, int b) {
        return a / b;
    }
}


public class class_with_multiple_methods {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(1, 2));
        System.out.println(c.sub(1, 2));
        System.out.println(c.mul(1, 2));
        System.out.println(c.div(1, 2));
    }
}
