package enums;

// Implement calculator using enum.
enum Calculator {
    ADD {
        int apply(int a, int b) {
            return a + b;
        }
    },
    SUB {
        int apply(int a, int b) {
            return a - b;
        }
    },
    MUL {
        int apply(int a, int b) {
            return a * b;
        }
    },
    DIV {
        int apply(int a, int b) {
            return a / b;
        }
    };

    abstract int apply(int a, int b);
}

public class enum_with_abstract_methods {
    public static void main(String[] args) {
        System.out.println(Calculator.ADD.apply(1, 2));
    }
}
