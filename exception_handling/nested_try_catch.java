package exception_handling;

public class nested_try_catch {
    public static void main(String[] args) {
        try {
            try {
                int a = 10 / 0;
            } catch (Exception e) {
                System.out.println("Inner catch");
            }
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println("Outer catch");
        }
    }
}
