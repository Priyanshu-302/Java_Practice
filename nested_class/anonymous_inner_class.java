package nested_class;

// Create an anonymous class for interface Runnable.
interface Runnable {
    public void run();
}

public class anonymous_inner_class {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            public void run() {
                System.out.println("Inside anonymous inner class");
            }
        };

        r.run();
    }
}
