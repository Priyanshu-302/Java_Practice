package enums;

// Print all enum values.
enum Colors {
    RED, BLUE, GREEN
}

public class enum_loop {
    public static void main(String[] args) {
        for (Colors color : Colors.values()) {
            System.out.println(color);
        }
    }
}
