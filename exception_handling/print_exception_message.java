package exception_handling;

public class print_exception_message {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
