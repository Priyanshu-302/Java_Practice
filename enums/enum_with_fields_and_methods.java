package enums;

// Create enum Level with priority and getter.
enum Level {
    LOW(1), HIGH(2);

    int val;

    Level(int val) {
        this.val = val;
    }

    int getVal() {
        return val;
    }
}

public class enum_with_fields_and_methods {
    public static void main(String[] args) {
        System.out.println(Level.HIGH.getVal());
        System.out.println(Level.LOW.getVal());
    }
}
