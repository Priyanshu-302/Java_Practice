package exception_handling;

public class basic_try_catch {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println("Error occured");
        }
    }
}
