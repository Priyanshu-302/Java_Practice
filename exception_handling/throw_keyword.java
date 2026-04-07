package exception_handling;

public class throw_keyword {
    public static void main(String[] args) {
        int age = -5;

        if (age < 0) {
            throw new ArithmeticException("Invalid age");
        }
    }
}
