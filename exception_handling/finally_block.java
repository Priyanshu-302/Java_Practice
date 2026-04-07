package exception_handling;

public class finally_block {
    public static void main(String[] args) {
        try {
            int a = 10 / 5;
        } catch (Exception e) {
            System.out.println("Exception occurred");
        } finally {
            System.out.println("This is finally block");
        }
    }
}
