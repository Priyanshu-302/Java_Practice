package exception_handling;

class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}

public class custom_exception {
    public static void main(String[] args) {
        try {
            throw new MyException("Custom Error");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
