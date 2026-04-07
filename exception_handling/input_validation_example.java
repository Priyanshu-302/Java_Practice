package exception_handling;

public class input_validation_example {
    public static void main(String[] args) {
        int num = -10;

        try {
            if (num < 0) {
                throw new Exception("Negative not allowed");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
